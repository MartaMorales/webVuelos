package com.camaras.wiku.service;

import com.camaras.wiku.dto.BuscarLoginDTO;
import com.camaras.wiku.model.Login;


public interface LoginService{
    Login getLoginFromForm(BuscarLoginDTO loginDTO);

    Login findUserByUsername(String username);

}
