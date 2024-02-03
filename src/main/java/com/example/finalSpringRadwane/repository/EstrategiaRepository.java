package com.example.finalSpringRadwane.repository;


import com.example.finalSpringRadwane.entity.Estrategia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstrategiaRepository extends JpaRepository<Estrategia,Long> {
}
