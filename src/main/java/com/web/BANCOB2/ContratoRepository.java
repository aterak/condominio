/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.BANCOB2;

import model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author veiga
 */
public interface ContratoRepository extends JpaRepository<Contrato, Long>{
    
}
