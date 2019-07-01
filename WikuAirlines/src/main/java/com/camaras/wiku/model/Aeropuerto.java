package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "aeropuerto")
public class Aeropuerto {
    private Integer id;
    private String nombre;
    private String direccion;
    private Ciudad ciudad;
    private Collection<Vuelo> vuelosAeropuertoSalida;
    private Collection<Vuelo> vuelosAeropuertoLlegada;

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
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aeropuerto that = (Aeropuerto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, direccion);
    }

    @ManyToOne
    @JoinColumn(name = "id_ciudad", referencedColumnName = "id")
    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @OneToMany(mappedBy = "aeropuertoSalida")
    public Collection<Vuelo> getVuelosAeropuertoSalida() {
        return vuelosAeropuertoSalida;
    }

    public void setVuelosAeropuertoSalida(Collection<Vuelo> vuelosAeropuertoSalida) {
        this.vuelosAeropuertoSalida = vuelosAeropuertoSalida;
    }

    @OneToMany(mappedBy = "aeropuertoLlegada")
    public Collection<Vuelo> getVuelosAeropuertoLlegada() {
        return vuelosAeropuertoLlegada;
    }

    public void setVuelosAeropuertoLlegada(Collection<Vuelo> vuelosAeropuertoLlegada) {
        this.vuelosAeropuertoLlegada = vuelosAeropuertoLlegada;
    }
}
