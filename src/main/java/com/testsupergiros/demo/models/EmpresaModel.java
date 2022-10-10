package com.testsupergiros.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class EmpresaModel {

	@Id
    @Column(unique = true, nullable = false)
	
	private int nit;
	private String nombre;
	private int estado;
	private String libre;
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getLibre() {
		return libre;
	}
	public void setLibre(String libre) {
		this.libre = libre;
	}
	
	
}
