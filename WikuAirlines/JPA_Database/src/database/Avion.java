package database;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Avion {
    private int id;
    private Integer asientos;
    private String modelo;
    private String matricula;
    private Collection<Asiento> asientosById;
    private Collection<Vuelo> vuelosById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "asientos")
    public Integer getAsientos() {
        return asientos;
    }

    public void setAsientos(Integer asientos) {
        this.asientos = asientos;
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
        return id == avion.id &&
                Objects.equals(asientos, avion.asientos) &&
                Objects.equals(modelo, avion.modelo) &&
                Objects.equals(matricula, avion.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, asientos, modelo, matricula);
    }

    @OneToMany(mappedBy = "avionByIdAvion")
    public Collection<Asiento> getAsientosById() {
        return asientosById;
    }

    public void setAsientosById(Collection<Asiento> asientosById) {
        this.asientosById = asientosById;
    }

    @OneToMany(mappedBy = "avionByIdAvion")
    public Collection<Vuelo> getVuelosById() {
        return vuelosById;
    }

    public void setVuelosById(Collection<Vuelo> vuelosById) {
        this.vuelosById = vuelosById;
    }
}
