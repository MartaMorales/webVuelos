package com.camaras.wiku.service;

import com.camaras.wiku.dto.BuscarLoginDTO;
import com.camaras.wiku.model.Login;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface LoginService extends UserDetailsService {
    Login getLoginFromForm(BuscarLoginDTO loginDTO);

    Login findUserByUsername(String username);

}
