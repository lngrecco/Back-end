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
public class dtoHabilidades {
    @NotBlank
    private String habilidad;
    @NotBlank
    private String porcentaje;

    public dtoHabilidades() {
    }

    public dtoHabilidades(String habilidad, String porcentaje) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
