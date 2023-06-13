/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.m4.PizzariaM4.repository;

import br.com.m4.PizzariaM4.entidades.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Guilherme
 */
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
    @Query("SELECT U.login, U.senha FROM Usuario U WHERE U.login = ?1 and U.senha = ?2")
    public String efetuarLogin(String login, String senha);
    public Usuario findByLogin(String login);
}