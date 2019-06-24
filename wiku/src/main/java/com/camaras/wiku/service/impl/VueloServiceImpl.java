package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.VueloDao;
import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Ciudad;
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

    private final String horaPattern = "HH:mm";
    private final Double precioBase = 50D;
    private final double suplementoCiudad = 1.5;
    private final double suplementoPais = 2;
    private final double suplementoContinente = 5;

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
        return getDuracionAndPrecioFromVuelosList(vuelos);
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
        return getDuracionAndPrecioFromVuelosList(vuelos);
    }

    /**
     * Recibe por parametro el listado de vuelos recuperado de base de datos. Calcula la duracion
     * del vuelo usando objetos localtime de java8. Setea la duracion y crea un listado nuevo con los vuelos completos
     * @param vuelos
     * @return
     */
    private List<Vuelo> getDuracionAndPrecioFromVuelosList(List<Vuelo> vuelos){
        List<Vuelo> vuelosWithDuracion = new ArrayList<>();

        for (Vuelo vuelo : vuelos) {
            vuelo.setDuracion(dateUtils.getDurarionFromVuelo(vuelo.getHoraSalida(), vuelo.getHoraLlegada(), horaPattern));
            vuelo.setPrecio(getPrecioForVuelo(vuelo));
            vuelosWithDuracion.add(vuelo);
        }
        return vuelosWithDuracion;
    }

    /**
     * Metodo que genera un algoritmo sencillo para calcular un precio dinámico para los vuelos.
     * Utiliza distintos multiplicadores en funcion a si cambia de pais o de continente,
     *  y un elemento "random" para añadir variedad.
     *
     * @param vuelo
     * @return
     */
    public Double getPrecioForVuelo(Vuelo vuelo){
        Double precioFinal = precioBase;
        Ciudad ciudadSalida = vuelo.getAeropuertoSalida().getCiudad();
        Ciudad ciudadLlegada =  vuelo.getAeropuertoLlegada().getCiudad();

        if(ciudadSalida.getId() != ciudadLlegada.getId()){
            precioFinal*=suplementoCiudad;
        }
        if (ciudadSalida.getPais().getId() != ciudadLlegada.getPais().getId()){
            precioFinal*=suplementoPais;
        }
        if (ciudadSalida.getPais().getContinente().getId() != ciudadLlegada.getPais().getContinente().getId()){
            precioFinal*=suplementoContinente;
        }
        precioFinal = precioFinal + vuelo.getAeropuertoSalida().getNombre().length() + vuelo.getAeropuertoLlegada().getNombre().length();

        return precioFinal;
    }

}


