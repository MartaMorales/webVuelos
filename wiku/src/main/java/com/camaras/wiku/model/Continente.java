package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "continente")
public class Continente {
    private Integer id;
    private String nombre;
    private Collection<Pais> pais;

    @Id
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continente that = (Continente) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @OneToMany(mappedBy = "continente")
    public Collection<Pais> getPais() {
        return pais;
    }

    public void setPais(Collection<Pais> pais) {
        this.pais = pais;
    }
}
