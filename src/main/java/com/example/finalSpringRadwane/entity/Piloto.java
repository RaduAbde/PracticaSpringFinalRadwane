package com.example.finalSpringRadwane.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "piloto")
public class Piloto {
    @Id
    @Column(name = "dni", nullable = false)
    private String dni;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    @Column(name = "estilo", nullable = false)
    private String estilo;

    /*
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "equipo_id", nullable = false)
    private Equipo equipo;*/
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @ManyToOne()
    @JoinColumn(name = "coche_matricula")
    private Coche coche;

}