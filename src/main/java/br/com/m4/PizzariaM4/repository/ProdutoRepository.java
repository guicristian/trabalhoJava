/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.m4.PizzariaM4.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.m4.PizzariaM4.entidades.Produto;
/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 */
public interface ProdutoRepository extends CrudRepository<Produto,Long>{
    
}

