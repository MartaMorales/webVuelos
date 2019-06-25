package com.camaras.wiku.dao;

import com.camaras.wiku.model.Cliente;
import com.camaras.wiku.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 *  Cliente Repository defines the CRUD repository methods for the
 *  Cliente object.
 */
@Repository
public interface ClienteDao extends JpaRepository<Cliente, Integer> {

//    List<Cliente> findAllByLogin(String mensaje);
  //  Cliente findById(String mensaje);

}
