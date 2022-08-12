
package com.example.Portfolio.SpringBoot.service;

import com.example.Portfolio.SpringBoot.model.Estudio;
import java.util.List;


public interface IEstudioService {
    
    public List<Estudio> verEstudios ();
    public void crearEstudio (Estudio est);
    public void borrarEstudio (Long id);
    public Estudio buscarEstudio (Long id);
}
