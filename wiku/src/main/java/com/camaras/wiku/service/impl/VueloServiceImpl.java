package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.VueloDao;
import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Vuelo;
import com.camaras.wiku.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VueloServiceImpl implements VueloService {

    @Autowired
    VueloDao vueloDao;

    @Override
    public List<Vuelo> getVuelosFromForm(BuscarDestinoDTO buscarDestinoDTO){
        List<Vuelo> vuelos = new ArrayList<>();

        vuelos = vueloDao.findAllByAeropuertoLlegada_Ciudad_NombreAndAeropuertoSalida_Ciudad_NombreAndHoraLlegadaAndHoraSalidaOrderByHoraSalidaAsc(buscarDestinoDTO.getDestino(), buscarDestinoDTO.getFechaLLegada(), buscarDestinoDTO.getFechaLLegadaInDate(), buscarDestinoDTO.getFechaSalidaInDate());

        return vuelos;
    }
}
