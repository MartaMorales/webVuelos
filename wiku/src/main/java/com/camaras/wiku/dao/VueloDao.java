package com.camaras.wiku.dao;

import com.camaras.wiku.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Vuelo Repository defines the CRUD repository methods for the
 *  Vuelo object.
 */
@Repository
public interface VueloDao extends JpaRepository<Vuelo, Integer> {

}
