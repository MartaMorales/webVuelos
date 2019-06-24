package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.dto.DatosPasajeroDTO;
import com.camaras.wiku.service.PaisService;
import com.camaras.wiku.service.PasajeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facturacion")
public class FacturacionController {
    private static final Logger logger = LoggerFactory.getLogger(FacturacionController.class);
    @Autowired
    PasajeroService pasajeroService;
    @Autowired
    PaisService paisService;

    @PostMapping("/formulario-reserva")
    public String goFacturacionForm(@ModelAttribute("buscarDestinoDTO") BuscarDestinoDTO buscarDestinoDTO, Model model) {
        logger.debug("Executing goFacturacionForm() method via Post");

        return "facturacion";
    }

    @PostMapping("/pasajero")
    public void insertarPasajero(@ModelAttribute("datosPasajeroDTO") DatosPasajeroDTO datosPasajeroDTO, Model model) {
        logger.debug("Executing insertarPasajero() method via Post throw facturacion.jsp form of facturacion");

        //List<Pasajero> pasajeros = pasajeroService.setPasajeroFromForm(datosPasajeroDTO);
        model.addAttribute(datosPasajeroDTO);
//        model.addAttribute("pasajeros", pasajeros);
    }
}