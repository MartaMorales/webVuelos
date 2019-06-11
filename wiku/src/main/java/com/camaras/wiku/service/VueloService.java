package com.camaras.wiku.service;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Vuelo;

import java.util.List;

public interface VueloService {

    List<Vuelo> getVuelosFromForm(BuscarDestinoDTO buscarDestinoDTO);

}
