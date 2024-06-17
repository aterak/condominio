/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author veiga
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
