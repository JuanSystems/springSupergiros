package com.testsupergiros.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @Column(unique = true, nullable = false)
    
    private int cedula;
    private String primernombre;
    private String segundonombre;
    private String primerapellido;
    private String segundoapellido;
    private String email;
    private String nitempresa;
    private int rol;
    private int estado;
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getPrimernombre() {
		return primernombre;
	}
	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}
	public String getSegundonombre() {
		return segundonombre;
	}
	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}
	public String getPrimerapellido() {
		return primerapellido;
	}
	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}
	public String getSegundoapellido() {
		return segundoapellido;
	}
	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNitempresa() {
		return nitempresa;
	}
	public void setNitempresa(String nitempresa) {
		this.nitempresa = nitempresa;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
    
    
	
    
	
    

    
    
}