package database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pasajero_reserva", schema = "vuelos", catalog = "")
public class PasajeroReserva {
    private int id;
    private Integer idPasajero;
    private Integer idReserva;
    private Pasajero pasajeroByIdPasajero;
    private Reserva reservaByIdReserva;

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
    @Column(name = "id_reserva")
    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasajeroReserva that = (PasajeroReserva) o;
        return id == that.id &&
                Objects.equals(idPasajero, that.idPasajero) &&
                Objects.equals(idReserva, that.idReserva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idPasajero, idReserva);
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
    @JoinColumn(name = "id_reserva", referencedColumnName = "id")
    public Reserva getReservaByIdReserva() {
        return reservaByIdReserva;
    }

    public void setReservaByIdReserva(Reserva reservaByIdReserva) {
        this.reservaByIdReserva = reservaByIdReserva;
    }
}
