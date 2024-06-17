/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author veiga
 */
@Entity
@Table(name= "contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String textolongo;

    public Contrato() {
    }

    public Contrato(Long Id, String textolongo) {
        this.Id = Id;
        this.textolongo = textolongo;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getTextolongo() {
        return textolongo;
    }

    public void setTextolongo(String textolongo) {
        this.textolongo = textolongo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.Id);
        hash = 59 * hash + Objects.hashCode(this.textolongo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contrato other = (Contrato) obj;
        if (!Objects.equals(this.textolongo, other.textolongo)) {
            return false;
        }
        return Objects.equals(this.Id, other.Id);
    }
    
    
    
    
}
