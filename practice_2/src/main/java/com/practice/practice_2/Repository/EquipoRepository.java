package com.example.champions.repository;

import com.example.champions.entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    // Puedes agregar consultas personalizadas si las necesitas.
}
