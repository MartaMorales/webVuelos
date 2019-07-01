package com.camaras.wiku.dao;

import com.camaras.wiku.model.Aeropuerto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Aeropuerto Repository defines the CRUD repository methods for the
 *  Aeropuerto object.
 */
@Repository
public interface AeropuertoDao extends JpaRepository<Aeropuerto, Integer> {

}
