/**
 * 
 */
package com.mrojo.ex02.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * @author Marc
 *
 */
@Entity
@Table(name = "visitas")
public class Visita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "dni_cliente")
	private String dniCliente;

	@ManyToOne
	@JoinColumn(name = "dni_dentista")
	private String dniDentista;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "fecha_hora")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime fechaHora;

	@Column(name = "precio")
	private double precio;

	public Visita() {
	}

	public Visita(long id, String dniCliente, String dniDentista, String descripcion, LocalDateTime fechaHora,
			double precio) {
		this.id = id;
		this.dniCliente = dniCliente;
		this.dniDentista = dniDentista;
		this.descripcion = descripcion;
		this.fechaHora = fechaHora;
		this.precio = precio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getDniDentista() {
		return dniDentista;
	}

	public void setDniDentista(String dniDentista) {
		this.dniDentista = dniDentista;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
