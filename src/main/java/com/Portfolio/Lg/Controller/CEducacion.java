/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.Lg.Controller;

import com.Portfolio.Lg.Dto.dtoEducacion;
import com.Portfolio.Lg.Entity.Educacion;
import com.Portfolio.Lg.Security.Controller.Mensaje;
import com.Portfolio.Lg.Service.SEducacion;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
        @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoeducacion){
        if(StringUtils.isBlank(dtoeducacion.getNombreE()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sEducacion.existsByNombreE(dtoeducacion.getNombreE()))
            return new ResponseEntity(new Mensaje("El nombre ya existe"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion = new Educacion(dtoeducacion.getNombreE(),dtoeducacion.getDescripcionE(), dtoeducacion.getFechaE(), dtoeducacion.getTituloE(), dtoeducacion.getLocalidadE(), dtoeducacion.getContactoE());
        sEducacion.save(educacion);
        
        return new ResponseEntity(new Mensaje("Educacion Agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoeducacion){
       if(!sEducacion.existsById(id))
           return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
       if(sEducacion.existsByNombreE(dtoeducacion.getNombreE()) && sEducacion.getByNombreE(dtoeducacion.getNombreE()).get().getId() !=id)
           return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
       if(StringUtils.isBlank(dtoeducacion.getNombreE()))
           return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
       
       Educacion educacion = sEducacion.getOne(id).get();
       educacion.setNombreE(dtoeducacion.getNombreE());
       educacion.setDescripcionE(dtoeducacion.getDescripcionE());
       educacion.setFechaE(dtoeducacion.getFechaE());
       educacion.setTituloE(dtoeducacion.getTituloE());
       educacion.setLocalidadE(dtoeducacion.getLocalidadE());
       educacion.setContactoE(dtoeducacion.getContactoE());
       
       sEducacion.save(educacion);
       return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
       
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("el id no existe"), HttpStatus.NOT_FOUND);
        sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
        
    }
}
