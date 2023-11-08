package com.aulaSecurity.demo.repository;

import com.aulaSecurity.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    Usuario findByUsername(String usernames);
}
