package com.camaras.wiku.dao;

import com.camaras.wiku.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Cliente Repository defines the CRUD repository methods for the
 *  Cliente object.
 */
@Repository
public interface ClienteDao extends JpaRepository<Cliente, Integer> {

}
