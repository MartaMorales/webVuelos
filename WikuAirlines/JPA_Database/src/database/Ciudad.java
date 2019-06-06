package database;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Ciudad {
    private int id;
    private Integer idPais;
    private String nombre;
    private String acronimo;
    private Collection<Aeropuerto> aeropuertosById;
    private Pais paisByIdPais;
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
    @Column(name = "id_pais")
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
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
        return id == ciudad.id &&
                Objects.equals(idPais, ciudad.idPais) &&
                Objects.equals(nombre, ciudad.nombre) &&
                Objects.equals(acronimo, ciudad.acronimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idPais, nombre, acronimo);
    }

    @OneToMany(mappedBy = "ciudadByIdCiudad")
    public Collection<Aeropuerto> getAeropuertosById() {
        return aeropuertosById;
    }

    public void setAeropuertosById(Collection<Aeropuerto> aeropuertosById) {
        this.aeropuertosById = aeropuertosById;
    }

    @ManyToOne
    @JoinColumn(name = "id_pais", referencedColumnName = "id")
    public Pais getPaisByIdPais() {
        return paisByIdPais;
    }

    public void setPaisByIdPais(Pais paisByIdPais) {
        this.paisByIdPais = paisByIdPais;
    }

    @OneToMany(mappedBy = "ciudadByIdCiudad")
    public Collection<Cliente> getClientesById() {
        return clientesById;
    }

    public void setClientesById(Collection<Cliente> clientesById) {
        this.clientesById = clientesById;
    }
}
