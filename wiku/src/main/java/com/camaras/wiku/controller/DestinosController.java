package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Vuelo;
import com.camaras.wiku.service.VueloService;
import com.camaras.wiku.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/destinos")
public class DestinosController {

    private static final Logger logger = LoggerFactory.getLogger(DestinosController.class);

    @Autowired
    VueloService vueloService;

    @GetMapping("")
    public String destinos(Model model) {
        logger.debug("Executing destinos() method via Get");
        model.addAttribute("buscarDestinoDTO", new BuscarDestinoDTO());
        return "destinos";
    }

    @PostMapping("/buscar")
    public String bucarDestinosFromIndexForm(@ModelAttribute("buscarDestinoDTO") BuscarDestinoDTO buscarDestinoDTO, Model model) {
        logger.debug("Executing buscarDestinosFromIndexForm() method via Get throw destinos.jsp form of destinos");

        List<Vuelo> vuelos = vueloService.getVuelosFromForm(buscarDestinoDTO);
        DateUtils format = new DateUtils();
        LocalDateTime fechaSalida;
        LocalDateTime fechaLlegada;
        ChronoLocalDate from;
        ChronoLocalDate to;

        for (Vuelo vuelo : vuelos) {
            String llegada = buscarDestinoDTO.getFechaLLegada()+" "+ vuelo.getHoraLlegada();
            String salida = buscarDestinoDTO.getFechaSalida() + " " + vuelo.getHoraSalida();

            fechaSalida = format.createDateFromStringWithFormat(salida, "LLL dd, yyyy HH:mm");
            fechaLlegada = format.createDateFromStringWithFormat(llegada, "LLL dd, yyyy HH:mm");
            from = ChronoLocalDate.from(fechaSalida);
            to = ChronoLocalDate.from(fechaLlegada);
            vuelo.setDuracion(ChronoPeriod.between(from, to));
        }
        model.addAttribute(buscarDestinoDTO);
        model.addAttribute("vuelos", vuelos);

        return "destinos";
    }

    @GetMapping("/buscar/{id_vuelo}/")
    public String destinos(@PathVariable("id_vuelo") Integer idVuelo, Model model) {
        logger.debug("Executing buscarDestinosFromIndexForm() method via Get throw index.jsp form of destinos");

        return "destinos";
    }
}

