package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.LoginDao;
import com.camaras.wiku.dto.BuscarLoginDTO;
import com.camaras.wiku.dto.CrearUsuarioDTO;
import com.camaras.wiku.model.Cliente;
import com.camaras.wiku.model.Login;
import com.camaras.wiku.service.ClienteService;
import com.camaras.wiku.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginDao loginDao;
    @Autowired
    ClienteService clienteService;


    @Override
    public Login getLoginFromForm(BuscarLoginDTO loginDTO) {
        return loginDao.findByUsuarioAndPassword(loginDTO.getUsuario(),loginDTO.getPassword());
    }

    @Transactional
    @Override
    public Login findUserByUsername(String username){
        return loginDao.findByUsuario(username);
    }

    @Override
    public Login createLoginFromUserForm(CrearUsuarioDTO crearUsuarioDTO) {
        Login login = new Login();
        Cliente cliente = new Cliente();
        cliente.setApellido1(crearUsuarioDTO.getApellido1());
        cliente.setApellido2(crearUsuarioDTO.getApellido2());
        cliente.setNombre(crearUsuarioDTO.getNombre());
        cliente.setEmail(crearUsuarioDTO.getEmail());
        cliente = clienteService.saveCliente(cliente);
        login.setCliente(cliente);
        login.setEmail(crearUsuarioDTO.getEmail());
        login.setPassword(crearUsuarioDTO.getPassword());
        login = saveLogin(login);

        return  login;
    }

    @Override
    public Login saveLogin(Login login) {
        return loginDao.save(login);
    }
}
