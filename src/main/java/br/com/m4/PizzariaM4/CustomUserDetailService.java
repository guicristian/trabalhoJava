/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.m4.PizzariaM4;
import br.com.m4.PizzariaM4.entidades.Usuario;
import br.com.m4.PizzariaM4.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guilherme
 */
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    /**
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Usuario usuario = usuarioRepository.findByLogin(username);
        if (usuario == null) {
            throw new UsernameNotFoundException(username);
        }
        UserDetails user = User.withUsername(usuario.getLogin()).password(usuario.getSenha()).roles(usuario.getPapel()).build();
        return user;
    }
}
