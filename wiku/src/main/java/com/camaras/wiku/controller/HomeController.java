package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/home"})
    public String home(Model model) {
        model.addAttribute("buscarDestinoDTO", new BuscarDestinoDTO());
        return "index";
    }
}
