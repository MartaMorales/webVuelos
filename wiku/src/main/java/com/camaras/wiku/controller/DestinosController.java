package com.camaras.wiku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/destinos")
public class DestinosController {

    @GetMapping("")
    public String destinos(Model model) {
//        model.addAttribute("message", "HowToDoInJava Reader !!");
        return "destinos";
    }
}
