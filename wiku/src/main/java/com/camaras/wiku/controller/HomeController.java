package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping({"", "/home"})
    public String home(Model model) {
        logger.debug("Executing home() method via Get");
        model.addAttribute("buscarDestinoDTO", new BuscarDestinoDTO());
        return "index";
    }
}
