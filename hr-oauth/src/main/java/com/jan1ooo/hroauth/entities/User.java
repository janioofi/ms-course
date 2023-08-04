package com.jan1ooo.hroauth.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id_user;
	private String name;

	private String email;
	private String password;

	Set<Role> roles = new HashSet<>();
	
	public User() {
		
	}
	
	public User(Long id_user, String name, String email, String password) {
		super();
		this.id_user = id_user;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
