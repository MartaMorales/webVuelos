package com.camaras.wiku.dao;

import com.camaras.wiku.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *  Pais Repository defines the CRUD repository methods for the
 *  Pais object.
 */
@Repository
public interface PaisDao extends JpaRepository<Pais, Integer> {

    @Query(value = "select p.nombre FROM Pais p")
    List<String> findAllPaisesName();
}
