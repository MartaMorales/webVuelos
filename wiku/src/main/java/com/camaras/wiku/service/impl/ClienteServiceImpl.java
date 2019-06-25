package com.camaras.wiku.service.impl;

import com.camaras.wiku.dao.ClienteDao;
import com.camaras.wiku.dto.CrearUsuarioDTO;
import com.camaras.wiku.model.Cliente;
import com.camaras.wiku.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteDao clienteDao;
    @Override
    public Cliente findClienteByEmail(String email) {
        return clienteDao.findByEmail(email);
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteDao.save(cliente);
    }
}
