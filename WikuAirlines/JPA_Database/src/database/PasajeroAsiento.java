package database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pasajero_asiento", schema = "vuelos", catalog = "")
public class PasajeroAsiento {
    private int id;
    private Integer idPasajero;
    private Integer idAsiento;
    private Pasajero pasajeroByIdPasajero;
    private Asiento asientoByIdAsiento;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_pasajero")
    public Integer getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Integer idPasajero) {
        this.idPasajero = idPasajero;
    }

    @Basic
    @Column(name = "id_asiento")
    public Integer getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(Integer idAsiento) {
        this.idAsiento = idAsiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasajeroAsiento that = (PasajeroAsiento) o;
        return id == that.id &&
                Objects.equals(idPasajero, that.idPasajero) &&
                Objects.equals(idAsiento, that.idAsiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idPasajero, idAsiento);
    }

    @ManyToOne
    @JoinColumn(name = "id_pasajero", referencedColumnName = "id")
    public Pasajero getPasajeroByIdPasajero() {
        return pasajeroByIdPasajero;
    }

    public void setPasajeroByIdPasajero(Pasajero pasajeroByIdPasajero) {
        this.pasajeroByIdPasajero = pasajeroByIdPasajero;
    }

    @ManyToOne
    @JoinColumn(name = "id_asiento", referencedColumnName = "id")
    public Asiento getAsientoByIdAsiento() {
        return asientoByIdAsiento;
    }

    public void setAsientoByIdAsiento(Asiento asientoByIdAsiento) {
        this.asientoByIdAsiento = asientoByIdAsiento;
    }
}
