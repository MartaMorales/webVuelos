package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "avion")
public class Avion {
    private Integer id;
    private Integer numeroAsientos;
    private String modelo;
    private String matricula;
    private Collection<Asiento> asientos;
    private Collection<Vuelo> vuelos;

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
    @Column(name = "asientos")
    public Integer getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(Integer numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Basic
    @Column(name = "modelo")
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Basic
    @Column(name = "matricula")
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avion avion = (Avion) o;
        return Objects.equals(id, avion.id) &&
                Objects.equals(numeroAsientos, avion.numeroAsientos) &&
                Objects.equals(modelo, avion.modelo) &&
                Objects.equals(matricula, avion.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroAsientos, modelo, matricula);
    }

    @OneToMany(mappedBy = "avion")
    public Collection<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(Collection<Asiento> asientos) {
        this.asientos = asientos;
    }

    @OneToMany(mappedBy = "avion")
    public Collection<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(Collection<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
