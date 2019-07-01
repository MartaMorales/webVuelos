package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Vuelo;
import com.camaras.wiku.service.VueloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("inicio", true);
        return "destinos";
    }

    @PostMapping("/buscar")
    public String bucarDestinosFromIndexForm(@ModelAttribute("buscarDestinoDTO") BuscarDestinoDTO buscarDestinoDTO, Model model) {
        logger.debug("Executing buscarDestinosFromIndexForm() method via Get throw destinos.jsp form of destinos");

        List<Vuelo> vuelosIda = vueloService.getVuelosIdaFromForm(buscarDestinoDTO);
        List<Vuelo> vuelosVuelta = vueloService.getVuelosVueltaFromForm(buscarDestinoDTO);

        if (!vuelosIda.isEmpty()) {
            buscarDestinoDTO.setVueloIda(vuelosIda.get(0).getId());
        }

        model.addAttribute(buscarDestinoDTO);
        model.addAttribute("inicio", false);
        model.addAttribute("vuelosIda", vuelosIda);
        model.addAttribute("vuelosVuelta", vuelosVuelta);

        return "destinos";
    }

    @GetMapping("/buscar/{nombre_ciudadIda}/{nombre_ciudadLlegada}")
    public String destinos(@PathVariable("nombre_ciudadIda") String nombreCiudadIda,
                           @PathVariable("nombre_ciudadLlegada") String nombreCiudadLlegada, Model model) {
        logger.debug("Executing buscarDestinosFromIndexForm() method via Get throw index.jsp form of destinos");
        BuscarDestinoDTO buscarDestinoDTO = new BuscarDestinoDTO();
        buscarDestinoDTO.setOrigen(nombreCiudadIda);
        buscarDestinoDTO.setDestino(nombreCiudadLlegada);
        model.addAttribute("buscarDestinoDTO", buscarDestinoDTO);
        model.addAttribute("inicio", true);
        return "destinos";
    }
}

