package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/destinos")
public class DestinosController {

    @GetMapping("")
    public String destinos(Model model) {
//        model.addAttribute("message", "HowToDoInJava Reader !!");
        return "destinos";
    }

    @PostMapping("/buscar")
    public String buscarDestinosFromIndexForm(@ModelAttribute("buscarDestinoDTO") BuscarDestinoDTO buscarDestinoDTO, Model model){
        System.out.println("Prueba");

        return "destinos";
    }
}
