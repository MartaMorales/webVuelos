package com.camaras.wiku.service;

import com.camaras.wiku.dto.BuscarLoginDTO;
import com.camaras.wiku.model.Login;

import java.util.List;

public interface LoginService {
    Login getLoginFromForm(BuscarLoginDTO loginDTO);
}
