package com.jan1ooo.hroauth.entities;

import java.io.Serializable;

public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id_role;
	private String roleName;
	
	public Role() {
		
	}

	public Role(Long id_role, String roleName) {
		super();
		this.id_role = id_role;
		this.roleName = roleName;
	}

	public Long getId_role() {
		return id_role;
	}

	public void setId_role(Long id_role) {
		this.id_role = id_role;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}
