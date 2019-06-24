package com.camaras.wiku.dto;

import com.camaras.wiku.model.Pasajero;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class DatosFacturacionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private BuscarDestinoDTO buscarDestinoDTO;

    //Datos de cliente
    private String nombre;
    private String Apellidos;
    private String dni;
    private LocalDateTime fechaNacimiento;
    private String nacionalidad;
    private String telefono;
    private List<Pasajero> pasajeroList;



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BuscarDestinoDTO getBuscarDestinoDTO() {
        return buscarDestinoDTO;
    }

    public void setBuscarDestinoDTO(BuscarDestinoDTO buscarDestinoDTO) {
        this.buscarDestinoDTO = buscarDestinoDTO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Pasajero> getPasajeroList() {
        return pasajeroList;
    }

    public void setPasajeroList(List<Pasajero> pasajeroList) {
        this.pasajeroList = pasajeroList;
    }

}
