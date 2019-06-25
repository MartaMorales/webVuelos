package com.camaras.wiku.dto;

import com.camaras.wiku.model.Pasajero;

import java.io.Serializable;
import java.util.List;

public class DatosFacturacionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private BuscarDestinoDTO buscarDestinoDTO;

    //Datos de la reserva
    private Double precioTotal;

    //Datos de cliente
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String email;
    private String calle;
    private Integer numero;
    private Integer piso;
    private String puerta;
    private Integer codigoPostal;
    private String localidad;
    private String provincia;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;

    //Datos Facturacion


    //Datos de pasarejos
    private List<Pasajero> pasajeroList;



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
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
