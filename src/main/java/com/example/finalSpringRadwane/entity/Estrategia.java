package com.example.finalSpringRadwane.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "estrategia")
public class Estrategia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "neumaticos", nullable = false)
    private String neumaticos;

    @Column(name = "combustible", nullable = false)
    private Double combustible;



}