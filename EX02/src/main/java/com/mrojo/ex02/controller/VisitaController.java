/**
 * 
 */
package com.mrojo.ex02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrojo.ex02.dto.Visita;
import com.mrojo.ex02.service.VisitaService;

/**
 * @author Marc
 *
 */
@RestController
@RequestMapping("/api")
public class VisitaController {

	@Autowired
	VisitaService visitaService;
	
	@GetMapping("/visitas")
	public List<Visita> listVisitas() {
		return visitaService.listVisitas();
	}

	@GetMapping("/visitas/{id}")
	public Visita visitaById(@PathVariable(name = "id") Long id) {
		Visita visitaxID = new Visita();

		visitaxID = visitaService.visitaById(id);

		return visitaxID;
	}
	
	@PostMapping("/visitas")
	public Visita saveVisita(@RequestBody Visita visita) {
		return visitaService.saveVisita(visita);
	}

	@PutMapping("/visitas/{id}")
	public Visita updateVisita(@PathVariable(name = "id") Long id, @RequestBody Visita visita) {
		Visita selectedVisita = new Visita(id, visita.getCliente(), visita.getDentista(), visita.getDescripcion(),
				visita.getFechaHora(), visita.getPrecio());
		Visita updatedVisita = new Visita();

		updatedVisita = visitaService.updateVisita(selectedVisita);
		return updatedVisita;
	}

	@DeleteMapping("/visitas/{id}")
	public void deleteVisita(@PathVariable(name = "id") Long id) {
		visitaService.deleteVisita(id);
	}
}
