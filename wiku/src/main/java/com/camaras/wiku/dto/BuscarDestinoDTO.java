package com.camaras.wiku.dto;

import com.camaras.wiku.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;

public class BuscarDestinoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String formDateFormat = "MMM dd,yyyy";

    private String origen;
    private String destino;
    private String fechaSalida;
    private String fechaLLegada;
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

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(String fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
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

    public Date getFechaSalidaInDate(){
        return DateUtils.createDateFromStringWithFormat(this.fechaSalida,formDateFormat);
    }

    public Date getFechaLLegadaInDate(){
        return DateUtils.createDateFromStringWithFormat(this.fechaLLegada,formDateFormat);
    }
}

