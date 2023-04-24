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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Marc
 *
 */
@Entity
@Table(name = "dentistas")
public class Dentista {

	@Id
	private String dni;

	@Column(name = "nombre_apellidos")
	private String nombreApellidos;

	private int telefono;
	
	private String email;
	
	private String especialidad;

	//@OneToMany
	//@JoinColumn(name = "dentista")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dentista")
	private List<Visita> visita;

	public Dentista() {
	}

	public Dentista(String dni, String nombreApellidos, int telefono, String email, String especialidad) {
		this.dni = dni;
		this.nombreApellidos = nombreApellidos;
		this.telefono = telefono;
		this.email = email;
		this.especialidad = especialidad;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
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
