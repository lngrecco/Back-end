/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.Lg.Repository;

import com.Portfolio.Lg.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas
 */
@Repository
public interface RPersona extends JpaRepository<Persona, Integer> {
    
    public Optional<Persona> findByNombre(String nombreE);
    public boolean existsByNombre(String nombreE);
}

