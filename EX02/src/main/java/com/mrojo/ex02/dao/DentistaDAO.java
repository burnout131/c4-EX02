/**
 * 
 */
package com.mrojo.ex02.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ex02.dto.Dentista;

/**
 * @author Marc
 *
 */
public interface DentistaDAO extends JpaRepository<Dentista, String> {

}
