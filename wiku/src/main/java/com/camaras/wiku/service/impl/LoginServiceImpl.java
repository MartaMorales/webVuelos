package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.LoginDao;
import com.camaras.wiku.dto.BuscarLoginDTO;
import com.camaras.wiku.model.Login;
import com.camaras.wiku.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginDao loginDao;

    @Override
    public Login getLoginFromForm(BuscarLoginDTO loginDTO) {
        return loginDao.findByUsuarioAndPassword(loginDTO.getUsuario(),loginDTO.getPassword());
    }

    @Transactional
    @Override
    public Login findUserByUsername(String username){
        return loginDao.findByUsuario(username);
    }
}
