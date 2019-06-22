package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.model.Ciudad;
import com.camaras.wiku.model.Oferta;
import com.camaras.wiku.service.CiudadService;
import com.camaras.wiku.service.OfertaService;
import javafx.beans.binding.ObjectExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    OfertaService ofertaService;
    @Autowired
    CiudadService ciudadService;

    @GetMapping({"", "/home"})
    public String home(Model model) {
        logger.debug("Executing home() method via Get");
        List<Oferta> ofertas = ofertaService.getOfertasForCarousel();

        model.addAttribute("buscarDestinoDTO", new BuscarDestinoDTO());
        model.addAttribute("ofertas",ofertas);

        return "index";
    }

    @GetMapping("/home/autocompletar")
    @ResponseBody
    public Map<String, Object> getCiudadesForAutocomplete(){
        Map<String, Object> ciudadesJson = new HashMap<>();

        List<String> ciudades = ciudadService.getAllCiudadesForAutocomplete();

        for (String ciudad: ciudades) {
            ciudadesJson.put(ciudad, null);
        }
        return ciudadesJson;
    }





}
