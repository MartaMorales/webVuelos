package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Oferta;
import com.camaras.wiku.model.Vuelo;
import com.camaras.wiku.service.OfertaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    OfertaService ofertaService;

    @GetMapping({"", "/home"})
    public String home(Model model) {
        logger.debug("Executing home() method via Get");

        List<Oferta> ofertas = ofertaService.getOfertasForCarousel();

        model.addAttribute("buscarDestinoDTO", new BuscarDestinoDTO());
        model.addAttribute("ofertas",ofertas);

        return "index";
    }



}
