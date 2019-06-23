package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.VueloDao;
import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Vuelo;
import com.camaras.wiku.service.VueloService;
import com.camaras.wiku.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.*;

@Service
public class VueloServiceImpl implements VueloService {

    private final String formDateFormat = "MMM dd,yyyy";

    @Autowired
    VueloDao vueloDao;

    @Autowired
    DateUtils dateUtils;

    @Override
    public List<Vuelo> getVuelosIdaFromForm(BuscarDestinoDTO buscarDestinoDTO){
        List<Vuelo> vuelos = vueloDao.findAllByAeropuertoLlegada_Ciudad_NombreAndAeropuertoSalida_Ciudad_NombreOrderByHoraSalidaAsc(buscarDestinoDTO.getDestino(),
                buscarDestinoDTO.getOrigen());
        return getDuracionFromVuelosList(buscarDestinoDTO.getFechaIda(), vuelos);
    }

    @Override
    public List<Vuelo> getVuelosVueltaFromForm(BuscarDestinoDTO buscarDestinoDTO){
        List<Vuelo> vuelos =  vueloDao.findAllByAeropuertoLlegada_Ciudad_NombreAndAeropuertoSalida_Ciudad_NombreOrderByHoraSalidaAsc(buscarDestinoDTO.getOrigen(),
                buscarDestinoDTO.getDestino());
        return getDuracionFromVuelosList(buscarDestinoDTO.getFechaVuelta(), vuelos);
    }

    private List<Vuelo> getDuracionFromVuelosList(String fecha, List<Vuelo> vuelos){
        List<Vuelo> vuelosWithDuracion = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        for (Vuelo vuelo : vuelos) {
            LocalTime salida = LocalTime.parse(vuelo.getHoraSalida(), formatter);
            LocalTime llegada = LocalTime.parse(vuelo.getHoraLlegada(), formatter);
            long seconds = Duration.between(salida, llegada).getSeconds();
            vuelo.setDuracion(TimeUnit.SECONDS.toHours(seconds)+" horas y "+
                    (TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60))+" minutos.");
            vuelosWithDuracion.add(vuelo);
        }
        return vuelosWithDuracion;
    }

}
