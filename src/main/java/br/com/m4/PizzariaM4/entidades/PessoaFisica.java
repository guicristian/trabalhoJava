/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.m4.PizzariaM4.entidades;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 * @date 12/05/2021
 * @brief  class PessoaFisica
 */
@Entity
@Getter
@Setter
public class PessoaFisica extends Pessoa{
    @Size(min=1,message = "O Telefone precisa ser válido.")
    private String telefone;

}