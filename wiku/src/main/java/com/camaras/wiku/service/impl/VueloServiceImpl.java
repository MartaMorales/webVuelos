package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.VueloDao;
import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Vuelo;
import com.camaras.wiku.service.VueloService;
import com.camaras.wiku.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VueloServiceImpl implements VueloService {

    private final String formDateFormat = "MMM dd,yyyy";

    @Autowired
    VueloDao vueloDao;

    @Autowired
    DateUtils dateUtils;

    @Override
    public List<Vuelo> getVuelosFromForm(BuscarDestinoDTO buscarDestinoDTO){
        Date llegada = dateUtils.createDateFromStringWithFormat(buscarDestinoDTO.getFechaLLegada(),formDateFormat);
        Date salida = dateUtils.createDateFromStringWithFormat(buscarDestinoDTO.getFechaSalida(),formDateFormat);

        return vueloDao.findAllByAeropuertoLlegada_Ciudad_NombreAndAeropuertoSalida_Ciudad_NombreAndHoraLlegadaAndHoraSalidaOrderByHoraSalidaAsc(buscarDestinoDTO.getDestino(),
                buscarDestinoDTO.getFechaLLegada(), llegada, salida);
    }

}
