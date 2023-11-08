package com.aulaSecurity.demo.service;

import com.aulaSecurity.demo.entity.Usuario;
import com.aulaSecurity.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //Usuario existe = usuarioRepository.findByUsername(username);

        UserDetails existeUser = usuarioRepository.findByUsername(username);
        if(existeUser == null){
            return null;
        }

        System.out.println(existeUser.getUsername());
        System.out.println(existeUser.getPassword());
        return existeUser;
    }
}
