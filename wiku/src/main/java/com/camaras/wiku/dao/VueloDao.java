package com.camaras.wiku.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  TarjetaDeCreditoDao Repository defines the CRUD repository methods for the
 *  TarjetaDeCreditoDao object.
 */
@Repository
public interface TarjetaDeCreditoDao extends JpaRepository<TarjetaDeCreditoDao, Integer> {

}
