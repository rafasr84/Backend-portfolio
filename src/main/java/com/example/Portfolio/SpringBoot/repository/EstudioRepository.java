
package com.example.Portfolio.SpringBoot.repository;

import com.example.Portfolio.SpringBoot.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository <Estudio, Long> {
    
}
