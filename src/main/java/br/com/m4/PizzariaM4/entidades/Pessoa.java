/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.m4.PizzariaM4.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 * @date 12/05/2021
 * @brief  class Pessoa
 */
@Entity
@Getter
@Setter
@Inheritance (strategy=InheritanceType.JOINED)
public abstract class Pessoa{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Size(min=1,message = "O nome precisa ser válido.")
    private String nome;

    @Override
    public String toString(){
        return nome;
    }
    
}
