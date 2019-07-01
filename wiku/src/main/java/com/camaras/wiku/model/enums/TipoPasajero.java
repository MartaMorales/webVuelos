package com.camaras.wiku.model.enums;

public enum TipoPasajero {
    ADULTO ("Adulto"),
    NINIO ("Niño");

    private final String texto;

    TipoPasajero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
