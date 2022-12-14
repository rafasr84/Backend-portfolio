
package com.example.Portfolio.SpringBoot.service;

import com.example.Portfolio.SpringBoot.Entity.Estudio;
import com.example.Portfolio.SpringBoot.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService {
    
    
    @Autowired
    public EstudioRepository estudRepo;

    @Override
    public List<Estudio> verEstudios() {
        return estudRepo.findAll();
    }

    @Override
    public void crearEstudio(Estudio est) {
        estudRepo.save(est);
    }

    @Override
    public void borrarEstudio(Long id) {
        estudRepo.deleteById(id);
    }

    @Override
    public Estudio buscarEstudio(Long id) {
        return estudRepo.findById(id).orElse(null);
    }
    
}
