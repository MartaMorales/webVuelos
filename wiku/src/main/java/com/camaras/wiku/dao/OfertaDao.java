package com.camaras.wiku.dao;

import com.camaras.wiku.model.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfertaDao extends JpaRepository <Oferta, Integer>{
    List<Oferta> findAll();
}
