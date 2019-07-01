package com.camaras.wiku.service;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Vuelo;

import java.util.List;

public interface VueloService {

    List<Vuelo> getVuelosIdaFromForm(BuscarDestinoDTO buscarDestinoDTO);
    List<Vuelo> getVuelosVueltaFromForm(BuscarDestinoDTO buscarDestinoDTO);

}
