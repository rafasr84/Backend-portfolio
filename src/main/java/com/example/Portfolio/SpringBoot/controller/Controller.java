
package com.example.Portfolio.SpringBoot.controller;

import com.example.Portfolio.SpringBoot.model.Estudio;
import com.example.Portfolio.SpringBoot.model.Experiencia;
import com.example.Portfolio.SpringBoot.model.Persona;
import com.example.Portfolio.SpringBoot.service.IEstudioService;
import com.example.Portfolio.SpringBoot.service.IExperienciaService;
import com.example.Portfolio.SpringBoot.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

   @Autowired
   private IPersonaService persoServ;

    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }




    @Autowired
   private IEstudioService estudServ;

    @PostMapping("/new/estudio")
    public void agregarEstudio (@RequestBody Estudio est){
        estudServ.crearEstudio(est);
    }

    @GetMapping("/ver/estudios")
    @ResponseBody
    public List<Estudio> verEstudios(){
        return estudServ.verEstudios();
    }

    @DeleteMapping("/delete/estudio{id}")
    public void borrarEstudio(@PathVariable Long id) {
        estudServ.borrarEstudio(id);
    }




    @Autowired
   private IExperienciaService experServ;

    @PostMapping("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        experServ.crearExperiencia(exp);
    }

    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return experServ.verExperiencias();
    }

    @DeleteMapping("/delete/experiencia{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        experServ.borrarExperiencia(id);
    }
    
   
}
