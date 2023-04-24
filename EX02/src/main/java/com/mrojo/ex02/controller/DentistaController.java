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

import com.mrojo.ex02.dto.Dentista;
import com.mrojo.ex02.dto.Visita;
import com.mrojo.ex02.service.DentistaService;
import com.mrojo.ex02.service.VisitaService;

/**
 * @author Marc
 *
 */
@RestController
@RequestMapping("/api")
public class DentistaController {

	@Autowired
	DentistaService dentistaService;

	@Autowired
	VisitaService visitaService;

	@GetMapping("/dentistas")
	public List<Dentista> listDentistas() {
		return dentistaService.listDentistas();
	}

	@GetMapping("/dentista/{dentistaDni}")
	public Dentista dentistaById(@PathVariable(name = "dentistaDni") String dni) {
		Dentista dentistaxID = new Dentista();

		dentistaxID = dentistaService.dentistaByDni(dni);

		return dentistaxID;
	}

	@GetMapping("/dentistas/{dentistaDni}/visitas")
	public List<Visita> listVisitasByDentistaId(@PathVariable(name = "dentistaDni") String dni) {
		return visitaService.listVisitasByDentistaId(dni);
	}

	@PostMapping("/dentistas")
	public Dentista saveDentista(@RequestBody Dentista dentista) {
		return dentistaService.saveDentista(dentista);
	}

	@PutMapping("/dentista/{dentistaDni}")
	public Dentista updateDentista(@PathVariable(name = "dentistaDni") String dni, @RequestBody Dentista dentista) {
		Dentista selectedDentista = new Dentista(dni, dentista.getNombreApellidos(), dentista.getTelefono(),
				dentista.getEmail(), dentista.getEspecialidad());
		Dentista updatedDentista = new Dentista();

		updatedDentista = dentistaService.updateDentista(selectedDentista);
		return updatedDentista;
	}

	@DeleteMapping("/dentistas/{dentistaDni}")
	public void deleteDentista(@PathVariable(name = "dentistaDni") String dni) {
		dentistaService.deleteDentista(dni);
	}
}
