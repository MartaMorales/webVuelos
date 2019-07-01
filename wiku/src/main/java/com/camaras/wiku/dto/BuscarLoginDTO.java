package com.camaras.wiku.dto;

import java.io.Serializable;

public class BuscarLoginDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
