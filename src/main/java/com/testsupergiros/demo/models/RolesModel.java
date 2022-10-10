package com.testsupergiros.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class RolesModel {

	@Id
    @Column(unique = true, nullable = false)
	
	private int id;
    private String rol;
    private int estado;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
    
	
	
    
    
}
