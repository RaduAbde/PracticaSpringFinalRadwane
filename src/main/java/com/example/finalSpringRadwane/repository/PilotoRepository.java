package com.example.finalSpringRadwane.repository;

import com.example.finalSpringRadwane.entity.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PilotoRepository extends JpaRepository<Piloto,String> {
    long countByCoche_Marca(String marca);

    List<Piloto> findByEquipo_Nombre(String nombre);

    List<Piloto> findByEstilo(String estilo);







}
