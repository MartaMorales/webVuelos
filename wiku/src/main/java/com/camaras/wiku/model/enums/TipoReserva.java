package com.camaras.wiku.model.enums;

public enum TipoReserva {
    IDA ("Ida"),
    VUELTA ("vuelta");

    private final String texto;

    TipoReserva(String texto) {
        this.texto = texto;
    }
}
