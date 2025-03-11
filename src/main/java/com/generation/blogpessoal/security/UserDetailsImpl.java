package com.generation.blogpessoal.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.blogpessoal.model.Usuario;

public class UserDetailsImpl implements UserDetails {

	// Controle de versão para essa classe
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	
	// Está lista trabalha com as autorizações que o usuário pode acessar
	private List<GrantedAuthority> authorities;

	// Método construtor (itens obrigatorios)
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}

	public UserDetailsImpl() {	}

	// Pode ser que retorne uma collection por isso a interrogação
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return authorities;
	}

	// Retorna a senha
	@Override
	public String getPassword() {

		return password;
	}

	// Retorna o usuario
	@Override
	public String getUsername() {

		return userName;
	}

	// Verifica se o acesso já expirou, se eu não precisar dessa validação colocar false
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	// Auxilia na validação, verificando se o usuario está bloqueado
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	// Valida se a credencial do usuario tem data limite de validade
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	// Verifica se está ativo
	@Override
	public boolean isEnabled() {
		return true;
	}
	
}
