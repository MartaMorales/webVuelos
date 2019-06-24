package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.PasajeroDao;
import com.camaras.wiku.dto.DatosFacturacionDTO;
import com.camaras.wiku.model.Pasajero;
import com.camaras.wiku.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasajeroServiceImpl implements PasajeroService {
    @Autowired
    PasajeroDao pasajeroDao;

    public boolean savePasajeroData(DatosFacturacionDTO datosFacturacionDTO) {
        Pasajero pasajero = new Pasajero();

        pasajero = pasajeroDao.save(pasajero);
        return pasajero!=null;
    }
}
