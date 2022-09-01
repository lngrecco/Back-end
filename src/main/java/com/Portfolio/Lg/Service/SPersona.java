/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.Lg.Service;

import com.Portfolio.Lg.Entity.Persona;
import com.Portfolio.Lg.Repository.RPersona;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas
 */
@Service
@Transactional
public class SPersona {
    @Autowired
    RPersona rPersona;
    
             public List<Persona> list(){
       return rPersona.findAll();
    }
    
     public Optional<Persona> getOne(int id){
        return rPersona.findById(id);
    }
     
    public Optional<Persona> getByNombre(String nombre){
        return rPersona.findByNombre(nombre);
    }
    
    public void save(Persona persona){
        rPersona.save(persona);
    }
    
    public void delete(int id){
        rPersona.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rPersona.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rPersona.existsByNombre(nombre);
    } 
     public Persona findPersona(int id) {
        Persona persona = rPersona.findById(id).orElse(null);
        return persona;
    }
}
