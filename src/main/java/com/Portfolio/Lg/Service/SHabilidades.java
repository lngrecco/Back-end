/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.Lg.Service;

import com.Portfolio.Lg.Entity.Habilidades;
import com.Portfolio.Lg.Repository.RHabilidades;
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
public class SHabilidades {
    @Autowired
     RHabilidades rHabilidades;
    
    public List<Habilidades> list(){
       return rHabilidades.findAll();
    }
    
     public Optional<Habilidades> getOne(int id){
        return rHabilidades.findById(id);
    }
     
    public Optional<Habilidades> getByHabilidad(String habilidad){
        return rHabilidades.findByHabilidad(habilidad);
    }
    
    public void save(Habilidades educacion){
        rHabilidades.save(educacion);
    }
    
    public void delete(int id){
        rHabilidades.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHabilidades.existsById(id);
    }
    
    public boolean existsByHabilidad(String habilidad){
        return rHabilidades.existsByHabilidad(habilidad);
    } 
}
