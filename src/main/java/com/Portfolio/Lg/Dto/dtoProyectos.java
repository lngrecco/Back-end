/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.Lg.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Lucas
 */
public class dtoProyectos {
     @NotBlank
    private String imagen;
    @NotBlank
    private String informacion;
    @NotBlank
    private String enlace;
    @NotBlank
    private String nombre;

    public dtoProyectos() {
    }

    public dtoProyectos(String imagen, String informacion, String enlace, String nombre) {
        this.imagen = imagen;
        this.informacion = informacion;
        this.enlace = enlace;
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
