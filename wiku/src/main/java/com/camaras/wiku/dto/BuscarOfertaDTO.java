package com.camaras.wiku.dto;

import com.camaras.wiku.model.Vuelo;

import java.util.List;

public class BuscarOfertaDTO {

    private List<Vuelo> vuelo;
    private String descripcion;
    private double preico;
    private String imgUrl;

    public List<Vuelo> getVuelo() {
        return vuelo;
    }

    public void setVuelo(List<Vuelo> vuelo) {
        this.vuelo = vuelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreico() {
        return preico;
    }

    public void setPreico(double preico) {
        this.preico = preico;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
