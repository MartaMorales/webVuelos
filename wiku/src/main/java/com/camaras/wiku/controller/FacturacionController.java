package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.dto.DatosFacturacionDTO;
import com.camaras.wiku.model.enums.Genero;
import com.camaras.wiku.model.enums.TipoPasajero;
import com.camaras.wiku.service.PaisService;
import com.camaras.wiku.service.PasajeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        DatosFacturacionDTO datosFacturacionDTO = new DatosFacturacionDTO();

        datosFacturacionDTO.setBuscarDestinoDTO(buscarDestinoDTO);

        model.addAttribute("generos", Genero.values());
        model.addAttribute("tipoPasajeros", TipoPasajero.values());
        model.addAttribute("paises", paisService.getAllPaises());
        model.addAttribute("datosFacturacionDTO", datosFacturacionDTO);

        return "facturacion";
    }

    @PostMapping("/pasajero")
    public void insertarPasajero(@ModelAttribute("datosFacturacionDTO") DatosFacturacionDTO datosFacturacionDTO, Model model) {
        logger.debug("Executing insertarPasajero() method via Post throw facturacion.jsp form of facturacion");

        //List<Pasajero> pasajeros = pasajeroService.setPasajeroFromForm(datosFacturacionDTO);
        model.addAttribute(datosFacturacionDTO);
//        model.addAttribute("pasajeros", pasajeros);
    }
}

