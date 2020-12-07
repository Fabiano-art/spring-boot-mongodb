package com.soft.domain.dto;

import java.io.Serializable;

import com.soft.domain.User;

public class UserDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String email;
	
	public UserDTO() {}
	
	public UserDTO(User obj) {
		this.nome = obj.getName();
		this.email = obj.getEmail();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
