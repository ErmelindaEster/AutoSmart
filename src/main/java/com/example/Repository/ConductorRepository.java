package com.example.Repository;

import org.springframework. data.jpa.repository.JpaRepository;
import com.example.Models.Conductor; 
import java.util.List; 

public interface ConductorRepository extends JpaRepository<Conductor, Integer> {
    List<Conductor> findByEstadoTrue(); // solo devuelve conductores activos
    
}
