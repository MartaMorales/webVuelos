package com.camaras.wiku.service;

import com.camaras.wiku.dto.BuscarLoginDTO;
import com.camaras.wiku.dto.CrearUsuarioDTO;
import com.camaras.wiku.model.Cliente;

import java.util.List;

public interface ClienteService {


    Cliente findClienteByEmail(String email);
    Cliente saveCliente(Cliente cliente);

}
