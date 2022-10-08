
package com.example.Portfolio.SpringBoot.repository;

import com.example.Portfolio.SpringBoot.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
    
}
