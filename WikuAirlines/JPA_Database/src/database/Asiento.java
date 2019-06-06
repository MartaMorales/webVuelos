package database;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Asiento {
    private int id;
    private String numero;
    private Integer idAvion;
    private Avion avionByIdAvion;
    private Collection<PasajeroAsiento> pasajeroAsientosById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "id_avion")
    public Integer getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(Integer idAvion) {
        this.idAvion = idAvion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return id == asiento.id &&
                Objects.equals(numero, asiento.numero) &&
                Objects.equals(idAvion, asiento.idAvion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, idAvion);
    }

    @ManyToOne
    @JoinColumn(name = "id_avion", referencedColumnName = "id")
    public Avion getAvionByIdAvion() {
        return avionByIdAvion;
    }

    public void setAvionByIdAvion(Avion avionByIdAvion) {
        this.avionByIdAvion = avionByIdAvion;
    }

    @OneToMany(mappedBy = "asientoByIdAsiento")
    public Collection<PasajeroAsiento> getPasajeroAsientosById() {
        return pasajeroAsientosById;
    }

    public void setPasajeroAsientosById(Collection<PasajeroAsiento> pasajeroAsientosById) {
        this.pasajeroAsientosById = pasajeroAsientosById;
    }
}
