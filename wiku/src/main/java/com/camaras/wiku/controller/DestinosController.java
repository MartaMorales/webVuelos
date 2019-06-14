package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Vuelo;
import com.camaras.wiku.service.VueloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String bucarDestinosFromIndexForm(@ModelAttribute("buscarDestinoDTO") BuscarDestinoDTO buscarDestinoDTO, Model model){
        logger.debug("Executing buscarDestinosFromIndexForm() method via Get throw index.jsp form of destinos");

        List<Vuelo> vuelos = vueloService.getVuelosFromForm(buscarDestinoDTO);

        model.addAttribute(buscarDestinoDTO);
        model.addAttribute("vuelos", vuelos);

        return "destinos";
    }
}
