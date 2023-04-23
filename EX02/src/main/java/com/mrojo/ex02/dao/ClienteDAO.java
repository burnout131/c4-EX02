/**
 * 
 */
package com.mrojo.ex02.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ex02.dto.Cliente;

/**
 * @author Marc
 *
 */
public interface ClienteDAO extends JpaRepository<Cliente, String> {

}
