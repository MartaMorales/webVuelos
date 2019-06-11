package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Pasajero {
    private Integer id;
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Collection<PasajeroAsiento> pasajeroAsientos;
    private Collection<PasajeroReserva> pasajeroReservas;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dni")
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido1")
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    @Basic
    @Column(name = "apellido2")
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return Objects.equals(id, pasajero.id) &&
                Objects.equals(dni, pasajero.dni) &&
                Objects.equals(nombre, pasajero.nombre) &&
                Objects.equals(apellido1, pasajero.apellido1) &&
                Objects.equals(apellido2, pasajero.apellido2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dni, nombre, apellido1, apellido2);
    }

    @OneToMany(mappedBy = "pasajero")
    public Collection<PasajeroAsiento> getPasajeroAsientos() {
        return pasajeroAsientos;
    }

    public void setPasajeroAsientos(Collection<PasajeroAsiento> pasajeroAsientos) {
        this.pasajeroAsientos = pasajeroAsientos;
    }

    @OneToMany(mappedBy = "pasajero")
    public Collection<PasajeroReserva> getPasajeroReservas() {
        return pasajeroReservas;
    }

    public void setPasajeroReservas(Collection<PasajeroReserva> pasajeroReservas) {
        this.pasajeroReservas = pasajeroReservas;
    }
}
