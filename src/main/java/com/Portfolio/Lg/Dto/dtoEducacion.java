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
public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String fechaE;
    @NotBlank
    private String localidadE;
    @NotBlank
    private String contactoE;
    @NotBlank
     private String tituloE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String fechaE, String localidadE, String contactoE, String tituloE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaE = fechaE;
        this.localidadE = localidadE;
        this.contactoE = contactoE;
        this.tituloE = tituloE;
    }

   

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getLocalidadE() {
        return localidadE;
    }

    public void setLocalidadE(String localidadE) {
        this.localidadE = localidadE;
    }

    public String getContactoE() {
        return contactoE;
    }

    public void setContactoE(String contactoE) {
        this.contactoE = contactoE;
    }

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }
    
    
}
