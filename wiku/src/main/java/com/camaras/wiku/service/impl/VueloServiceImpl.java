package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.VueloDao;
import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Vuelo;
import com.camaras.wiku.service.VueloService;
import com.camaras.wiku.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class VueloServiceImpl implements VueloService {

    @Autowired
    VueloDao vueloDao;

    @Autowired
    DateUtils dateUtils;

    /**
     * Este metodo recibe por parametro un DTO del formulario de destinos y hace una busqueda de vuelos
     * usando la ciudad de ida y de vuelta como se configura en el formulario. posteriormente calcula la duracion
     * de cada vuelo y devuelve el listado al controlador.
     * @param buscarDestinoDTO
     * @return
     */
    @Override
    public List<Vuelo> getVuelosIdaFromForm(BuscarDestinoDTO buscarDestinoDTO){
        List<Vuelo> vuelos = vueloDao.findAllByAeropuertoLlegada_Ciudad_NombreAndAeropuertoSalida_Ciudad_NombreOrderByHoraSalidaAsc(
                buscarDestinoDTO.getDestino(),
                buscarDestinoDTO.getOrigen());
        return getDuracionFromVuelosList(buscarDestinoDTO.getFechaIda(), vuelos);
    }
    /**
     * Este metodo recibe por parametro un DTO del formulario de destinos y hace una busqueda de vuelos
     * usando la ciudad de ida y de vuelta al reves de como se configura en el formulario. posteriormente calcula la duracion
     * de cada vuelo y devuelve el listado al controlador.
     * @param buscarDestinoDTO
     * @return
     */
    @Override
    public List<Vuelo> getVuelosVueltaFromForm(BuscarDestinoDTO buscarDestinoDTO){
        List<Vuelo> vuelos =  vueloDao.findAllByAeropuertoLlegada_Ciudad_NombreAndAeropuertoSalida_Ciudad_NombreOrderByHoraSalidaAsc(
                buscarDestinoDTO.getOrigen(),
                buscarDestinoDTO.getDestino());
        return getDuracionFromVuelosList(buscarDestinoDTO.getFechaVuelta(), vuelos);
    }

    /**
     * Recibe por parametro la fecha del vuelo y el listado de vuelos recuperado de base de datos. Calcula la duracion
     * del vuelo usando objetos localtime de java8. Setea la duracion y crea un listado nuevo con los vuelos completos
     * @param fecha
     * @param vuelos
     * @return
     */
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
            vuelo.setPrecio(200D);
        }
        return vuelosWithDuracion;
    }

}
