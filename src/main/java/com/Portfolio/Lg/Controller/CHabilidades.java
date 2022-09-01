/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.Lg.Controller;

import com.Portfolio.Lg.Dto.dtoHabilidades;
import com.Portfolio.Lg.Entity.Habilidades;
import com.Portfolio.Lg.Security.Controller.Mensaje;
import com.Portfolio.Lg.Service.SHabilidades;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas
 */
@RestController
@RequestMapping("/habilidades")
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidades {
    @Autowired
    SHabilidades sHabilidades;
    
        @GetMapping("/lista")
    public ResponseEntity<List<Habilidades>> list(){
        List<Habilidades> list = sHabilidades.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Habilidades> getById(@PathVariable("id") int id){
        if(!sHabilidades.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Habilidades habilidades = sHabilidades.getOne(id).get();
        return new ResponseEntity(habilidades, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHabilidades dtohabilidades){
        if(StringUtils.isBlank(dtohabilidades.getHabilidad()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sHabilidades.existsByHabilidad(dtohabilidades.getHabilidad()))
            return new ResponseEntity(new Mensaje("El nombre ya existe"), HttpStatus.BAD_REQUEST);
        
        Habilidades habilidades = new Habilidades(dtohabilidades.getHabilidad(),dtohabilidades.getPorcentaje());
        sHabilidades.save(habilidades);
        
        return new ResponseEntity(new Mensaje("Habilidad Agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHabilidades dtohabilidades){
       if(!sHabilidades.existsById(id))
           return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
       if(sHabilidades.existsByHabilidad(dtohabilidades.getHabilidad()) && sHabilidades.getByHabilidad(dtohabilidades.getHabilidad()).get().getId() !=id)
           return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
       if(StringUtils.isBlank(dtohabilidades.getHabilidad()))
           return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
       
       Habilidades habilidades = sHabilidades.getOne(id).get();
       habilidades.setHabilidad(dtohabilidades.getHabilidad());
       habilidades.setPorcentaje(dtohabilidades.getPorcentaje());
       
       
       sHabilidades.save(habilidades);
       return new ResponseEntity(new Mensaje("Habilidad actualizada"), HttpStatus.OK);
       
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!sHabilidades.existsById(id))
            return new ResponseEntity(new Mensaje("el id no existe"), HttpStatus.NOT_FOUND);
        sHabilidades.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
        
    }
}
