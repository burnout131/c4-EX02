/**
 * 
 */
package com.mrojo.ex02.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Marc
 *
 */
@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	private String dni;

	@Column(name = "nombre_apellidos")
	private String nombreApellidos;

	private int telefono;
	
	private String email;

	//@OneToMany
	//@JoinColumn(name = "cliente")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Visita> visita;

	public Cliente() {
	}

	public Cliente(String dni, String nombreApellidos, int telefono, String email) {
		this.dni = dni;
		this.nombreApellidos = nombreApellidos;
		this.telefono = telefono;
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Visita")
	public List<Visita> getVisita() {
		return visita;
	}

	public void setVisita(List<Visita> visita) {
		this.visita = visita;
	}

}
