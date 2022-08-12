
package com.example.Portfolio.SpringBoot.service;

import com.example.Portfolio.SpringBoot.model.Experiencia;
import com.example.Portfolio.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository experRepo;

        @Override
    public List<Experiencia> verExperiencias() {
        return experRepo.findAll();
    }
        @Override
    public void crearExperiencia(Experiencia exp) {
        experRepo.save(exp);

    }

        @Override
    public void borrarExperiencia(Long id) {
        experRepo.deleteById(id);

    }
        @Override
    public Experiencia buscarExperiencia(Long id) {
        return experRepo.findById(id).orElse(null);

    }
    
}
