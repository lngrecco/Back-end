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
public class dtoPersona {

    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String img;
    @NotBlank
    private String fecha;
    @NotBlank
    private String telefono;
    @NotBlank
    private String ciudad;
    @NotBlank
    private String email;
    @NotBlank
    private String direccion;
    @NotBlank
    private String nacionalidad;
    @NotBlank
    private String profesion;
    @NotBlank
    private String acerca;
    @NotBlank
    private String demi;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String img, String fecha, String telefono, String ciudad, String email, String direccion, String nacionalidad, String profesion, String acerca, String demi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.fecha = fecha;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.email = email;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.profesion = profesion;
        this.acerca = acerca;
        this.demi = demi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getDemi() {
        return demi;
    }

    public void setDemi(String demi) {
        this.demi = demi;
    }

    
}
