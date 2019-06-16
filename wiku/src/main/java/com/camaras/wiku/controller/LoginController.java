package com.camaras.wiku.controller;

import com.camaras.wiku.dto.BuscarLoginDTO;
import com.camaras.wiku.model.Login;
import com.camaras.wiku.service.LoginService;
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
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
@Autowired
LoginService loginService;

    @GetMapping("")
    public String login(Model model) {
        logger.debug("Executing login() method via Get");
        model.addAttribute("buscarLoginDTO", new BuscarLoginDTO());

        return "login";
    }

    @PostMapping("/buscar")
    public String bucarLogin(@ModelAttribute("buscarLoginDTO") BuscarLoginDTO buscarLoginDTO, Model model){
        logger.debug("Executing buscarLogin() method via Get throw login.jsp form of login");

       Login login = loginService.getLoginFromForm(buscarLoginDTO);

        model.addAttribute(buscarLoginDTO);
        model.addAttribute("login", login);

        return "index";
    }
}
