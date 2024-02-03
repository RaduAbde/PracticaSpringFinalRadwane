package com.example.finalSpringRadwane.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "coche")
public class Coche {
    @Id
    @Column(name = "matricula", nullable = false)
    private String matricula;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "potencia", nullable = false)
    private Integer potencia;

    @JsonBackReference
    @OneToMany(mappedBy = "coche", orphanRemoval = true, cascade = CascadeType.DETACH)
    private List<Piloto> pilotos = new ArrayList<>();


}