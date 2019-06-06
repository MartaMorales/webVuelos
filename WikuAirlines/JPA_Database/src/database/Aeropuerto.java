package database;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Aeropuerto {
    private int id;
    private String nombre;
    private Integer idCiudad;
    private String direccion;
    private Ciudad ciudadByIdCiudad;
    private Collection<Vuelo> vuelosById;
    private Collection<Vuelo> vuelosById_0;

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
    @Column(name = "id_ciudad")
    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
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
        return id == that.id &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(idCiudad, that.idCiudad) &&
                Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, idCiudad, direccion);
    }

    @ManyToOne
    @JoinColumn(name = "id_ciudad", referencedColumnName = "id")
    public Ciudad getCiudadByIdCiudad() {
        return ciudadByIdCiudad;
    }

    public void setCiudadByIdCiudad(Ciudad ciudadByIdCiudad) {
        this.ciudadByIdCiudad = ciudadByIdCiudad;
    }

    @OneToMany(mappedBy = "aeropuertoByIdAeropuertoSalida")
    public Collection<Vuelo> getVuelosById() {
        return vuelosById;
    }

    public void setVuelosById(Collection<Vuelo> vuelosById) {
        this.vuelosById = vuelosById;
    }

    @OneToMany(mappedBy = "aeropuertoByIdAeropuertoLlegada")
    public Collection<Vuelo> getVuelosById_0() {
        return vuelosById_0;
    }

    public void setVuelosById_0(Collection<Vuelo> vuelosById_0) {
        this.vuelosById_0 = vuelosById_0;
    }
}
