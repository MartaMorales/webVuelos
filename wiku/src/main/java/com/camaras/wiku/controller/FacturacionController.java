package com.camaras.wiku.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facturacion")
public class FacturacionController {

    @GetMapping("")
    public String facturacion (Model model){
        return "facturacion";
    }
}
