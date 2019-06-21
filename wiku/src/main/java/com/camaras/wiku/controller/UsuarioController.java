package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarDestinoDTO;
import com.camaras.wiku.dto.CrearUsuarioDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UsuarioController {
    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @GetMapping("/usuario")
    public String usuario(Model model){
        logger.debug("Executing usuario() method via Get");
        model.addAttribute("crearUsuarioDTO", new CrearUsuarioDTO());
        return "usuario";
    }

    @PostMapping("/crearusuario")
    public void crearUsuario(@ModelAttribute("crearUsuarioDTO") CrearUsuarioDTO crearUsuarioDTO, Model model){
        logger.debug("Executing crearUsuario() method via post throw usuario.jsp ");
        model.addAttribute(crearUsuarioDTO);
    }
}
