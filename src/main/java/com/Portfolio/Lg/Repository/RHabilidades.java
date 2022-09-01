/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.Lg.Repository;

import com.Portfolio.Lg.Entity.Habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas
 */
@Repository
public interface RHabilidades extends JpaRepository<Habilidades, Integer>{
    public Optional<Habilidades> findByHabilidad(String habilidad);
    public boolean existsByHabilidad(String habilidad);
}
