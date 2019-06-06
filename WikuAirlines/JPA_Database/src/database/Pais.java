package database;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Pais {
    private int id;
    private String nombre;
    private String acronimo;
    private Collection<Ciudad> ciudadsById;
    private Collection<Cliente> clientesById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return id == pais.id &&
                Objects.equals(nombre, pais.nombre) &&
                Objects.equals(acronimo, pais.acronimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, acronimo);
    }

    @OneToMany(mappedBy = "paisByIdPais")
    public Collection<Ciudad> getCiudadsById() {
        return ciudadsById;
    }

    public void setCiudadsById(Collection<Ciudad> ciudadsById) {
        this.ciudadsById = ciudadsById;
    }

    @OneToMany(mappedBy = "paisByIdPais")
    public Collection<Cliente> getClientesById() {
        return clientesById;
    }

    public void setClientesById(Collection<Cliente> clientesById) {
        this.clientesById = clientesById;
    }
}
