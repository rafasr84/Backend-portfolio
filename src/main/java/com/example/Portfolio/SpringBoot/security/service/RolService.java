
package com.example.Portfolio.SpringBoot.security.service;

import com.example.Portfolio.SpringBoot.security.entity.Rol;
import com.example.Portfolio.SpringBoot.security.enums.RolNombre;
import com.example.Portfolio.SpringBoot.security.repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
    
}
