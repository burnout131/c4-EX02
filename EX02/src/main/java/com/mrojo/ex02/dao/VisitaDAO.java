/**
 * 
 */
package com.mrojo.ex02.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ex02.dto.Visita;

/**
 * @author Marc
 *
 */
public interface VisitaDAO extends JpaRepository<Visita, Long> {

	public List<Visita> findVisitaByClienteId(String dniCliente);

	public List<Visita> findVisitaByDentistaId(String dniDentista);
}
