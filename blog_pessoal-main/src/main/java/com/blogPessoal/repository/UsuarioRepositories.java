package com.blogPessoal.repository;

import com.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepositories extends JpaRepository<Usuario,Long> {
    public Optional<Usuario> findByUsuario(@Param("usuario") String usuario);

    public List <Usuario> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);}