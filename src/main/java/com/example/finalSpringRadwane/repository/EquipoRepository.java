package com.example.finalSpringRadwane.repository;


import com.example.finalSpringRadwane.entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo,Long> {
    List<Equipo> findByCompeticion(String competicion);

    List<Equipo> findByEstrategia_Neumaticos(String neumaticos);


    @Override
    Optional<Equipo> findById(Long aLong);
}
