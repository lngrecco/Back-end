/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.Lg.Controller;

import com.Portfolio.Lg.Dto.dtoPersona;
import com.Portfolio.Lg.Entity.Persona;
import com.Portfolio.Lg.Security.Controller.Mensaje;
import com.Portfolio.Lg.Service.SPersona;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas
 */
@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    @Autowired
    SPersona sPersona;
   
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
        return sPersona.findPersona((int)1);
    }
    
     @PutMapping("personas/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtopersona){
       if(!sPersona.existsById(id))
           return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
       if(sPersona.existsByNombre(dtopersona.getNombre()) && sPersona.getByNombre(dtopersona.getNombre()).get().getId() !=id)
           return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
       if(StringUtils.isBlank(dtopersona.getNombre()))
           return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
       
       Persona persona = sPersona.getOne(id).get();
       persona.setNombre(dtopersona.getNombre());
       persona.setApellido(dtopersona.getApellido());
       persona.setImg(dtopersona.getImg());
       persona.setFecha(dtopersona.getFecha());
       persona.setTelefono(dtopersona.getTelefono());
       persona.setCiudad(dtopersona.getCiudad());
       persona.setEmail(dtopersona.getEmail());
       persona.setDireccion(dtopersona.getDireccion());
       persona.setNacionalidad(dtopersona.getNacionalidad());
       persona.setProfesion(dtopersona.getProfesion());
       persona.setAcerca(dtopersona.getAcerca());
       persona.setDemi(dtopersona.getDemi());
       
       sPersona.save(persona);
       return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
       
    }
}
