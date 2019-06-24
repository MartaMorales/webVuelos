package com.camaras.wiku.model.enums;

public enum Genero {
    HOMBRE ("Sr."),
    MUJER ("Sra.");

    private final String texto;

    Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
