package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Pais {
    private Integer id;
    private String nombre;
    private String acronimo;
    private Collection<Ciudad> ciudads;
    private Collection<Cliente> clientes;

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
    @Column(name = "acronimo")
    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(id, pais.id) &&
                Objects.equals(nombre, pais.nombre) &&
                Objects.equals(acronimo, pais.acronimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, acronimo);
    }

    @OneToMany(mappedBy = "pais")
    public Collection<Ciudad> getCiudads() {
        return ciudads;
    }

    public void setCiudads(Collection<Ciudad> ciudads) {
        this.ciudads = ciudads;
    }

    @OneToMany(mappedBy = "pais")
    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }
}
