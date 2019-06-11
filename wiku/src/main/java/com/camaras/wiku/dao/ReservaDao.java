package com.camaras.wiku.dao;

import com.camaras.wiku.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Reserva Repository defines the CRUD repository methods for the
 *  Reserva object.
 */
@Repository
public interface ReservaDao extends JpaRepository<Reserva, Integer> {

}
