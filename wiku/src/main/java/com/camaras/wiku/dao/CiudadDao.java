package com.camaras.wiku.dao;

import com.camaras.wiku.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Ciudad Repository defines the CRUD repository methods for the
 *  Ciudad object.
 */
@Repository
public interface CiudadDao extends JpaRepository<Ciudad, Integer> {

}
