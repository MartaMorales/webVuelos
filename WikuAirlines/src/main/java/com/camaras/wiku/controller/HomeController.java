package com.camaras.wiku.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/prueba")
    public String prueba(Model model) {
        logger.info("prueba");

        return "index";
    }
}
