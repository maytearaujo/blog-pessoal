package com.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	// Permite realizar uma pesquisa pelo usuario
	// SELECT * FROM tb_usuarios WHERE usuario="jaqueline@gmail.com"
	public Optional<Usuario> findByUsuario(String usuario);
}
