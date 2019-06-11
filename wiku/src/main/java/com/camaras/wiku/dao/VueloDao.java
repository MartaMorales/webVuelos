package com.camaras.wiku.dao;

import com.camaras.wiku.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 *  Vuelo Repository defines the CRUD repository methods for the
 *  Vuelo object.
 */
@Repository
public interface VueloDao extends JpaRepository<Vuelo, Integer> {

    List<Vuelo> findAllByAeropuertoLlegada_Ciudad_NombreAndAeropuertoSalida_Ciudad_NombreAndHoraLlegadaAndHoraSalidaOrderByHoraSalidaAsc(String ciudadLlegada, String ciudadSalida, Date horaLlegada, Date horaSalida);

}
