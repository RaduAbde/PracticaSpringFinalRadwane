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
@Table(name = "equipo")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "presupuesto", nullable = false)
    private Double presupuesto;

    @Column(name = "competicion")
    private String competicion;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "estrategia_id", nullable = false)
    private Estrategia estrategia;


    @JsonBackReference
    @OneToMany(mappedBy = "equipo", cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<Piloto> pilotos = new ArrayList<>();

}