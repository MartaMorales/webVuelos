package com.camaras.wiku.dao;

import com.camaras.wiku.model.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Pasajero Repository defines the CRUD repository methods for the
 *  Pasajero object.
 */
@Repository
public interface PasajeroDao extends JpaRepository<Pasajero, Integer> {

}
