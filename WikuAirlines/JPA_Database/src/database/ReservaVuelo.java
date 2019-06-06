package database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reserva_vuelo", schema = "vuelos", catalog = "")
public class ReservaVuelo {
    private int id;
    private Integer idReserva;
    private Integer idVuelo;
    private Reserva reservaByIdReserva;
    private Vuelo vueloByIdVuelo;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_reserva")
    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    @Basic
    @Column(name = "id_vuelo")
    public Integer getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservaVuelo that = (ReservaVuelo) o;
        return id == that.id &&
                Objects.equals(idReserva, that.idReserva) &&
                Objects.equals(idVuelo, that.idVuelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idReserva, idVuelo);
    }

    @ManyToOne
    @JoinColumn(name = "id_reserva", referencedColumnName = "id")
    public Reserva getReservaByIdReserva() {
        return reservaByIdReserva;
    }

    public void setReservaByIdReserva(Reserva reservaByIdReserva) {
        this.reservaByIdReserva = reservaByIdReserva;
    }

    @ManyToOne
    @JoinColumn(name = "id_vuelo", referencedColumnName = "id")
    public Vuelo getVueloByIdVuelo() {
        return vueloByIdVuelo;
    }

    public void setVueloByIdVuelo(Vuelo vueloByIdVuelo) {
        this.vueloByIdVuelo = vueloByIdVuelo;
    }
}
