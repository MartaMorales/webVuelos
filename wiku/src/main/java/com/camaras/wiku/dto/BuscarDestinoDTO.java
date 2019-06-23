package com.camaras.wiku.dto;

import com.camaras.wiku.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;

public class BuscarDestinoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String origen;
    private String destino;
    private String fechaIda;
    private String fechaVuelta;
    private Integer adultos;
    private Integer ninos;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public String getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(String FechaVuelta) {
        this.fechaVuelta = FechaVuelta;
    }

    public Integer getAdultos() {
        return adultos;
    }

    public void setAdultos(Integer adultos) {
        this.adultos = adultos;
    }

    public Integer getNinos() {
        return ninos;
    }

    public void setNinos(Integer ninos) {
        this.ninos = ninos;
    }

}

