/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.Lg.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucas
 */
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String tituloE;
    private String descripcionE;
    private String fechaE;
    private String localidadE;
    private String contactoE;

    public Educacion() {
    }

    public Educacion(String nombreE, String tituloE, String descripcionE, String fechaE, String localidadE, String contactoE) {
        this.nombreE = nombreE;
        this.tituloE = tituloE;
        this.descripcionE = descripcionE;
        this.fechaE = fechaE;
        this.localidadE = localidadE;
        this.contactoE = contactoE;
    }

    

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
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
    
    
}

