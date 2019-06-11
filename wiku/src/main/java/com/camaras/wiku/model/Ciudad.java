package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ciudad")
public class Ciudad {
    private Integer id;
    private String nombre;
    private String acronimo;
    private Collection<Aeropuerto> aeropuertos;
    private Pais pais;
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
        Ciudad ciudad = (Ciudad) o;
        return Objects.equals(id, ciudad.id) &&
                Objects.equals(nombre, ciudad.nombre) &&
                Objects.equals(acronimo, ciudad.acronimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, acronimo);
    }

    @OneToMany(mappedBy = "ciudad")
    public Collection<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public void setAeropuertos(Collection<Aeropuerto> aeropuertos) {
        this.aeropuertos = aeropuertos;
    }

    @ManyToOne
    @JoinColumn(name = "id_pais", referencedColumnName = "id")
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @OneToMany(mappedBy = "ciudad")
    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }
}
