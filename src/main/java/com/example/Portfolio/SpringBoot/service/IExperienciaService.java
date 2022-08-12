
package com.example.Portfolio.SpringBoot.service;

import com.example.Portfolio.SpringBoot.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
 
    
    public List<Experiencia> verExperiencias ();
    public void crearExperiencia(Experiencia Exp);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia (Long id);                        

}
