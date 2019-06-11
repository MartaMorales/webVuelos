package com.camaras.wiku.dao;

import com.camaras.wiku.model.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Avion Repository defines the CRUD repository methods for the
 *  Avion object.
 */
@Repository
public interface AvionDao extends JpaRepository<Avion, Integer> {

}
