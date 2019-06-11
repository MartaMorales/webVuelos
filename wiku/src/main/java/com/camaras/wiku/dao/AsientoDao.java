package com.camaras.wiku.dao;

import com.camaras.wiku.model.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Asiento Repository defines the CRUD repository methods for the
 *  Asiento object.
 */
@Repository
public interface AsientoDao extends JpaRepository<Asiento, Integer> {

}
