package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pasajero_reserva", schema = "wiku_airlines", catalog = "")
public class PasajeroReserva {
    private Integer id;
    private Pasajero pasajero;
    private Reserva reserva;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasajeroReserva that = (PasajeroReserva) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToOne
    @JoinColumn(name = "id_pasajero", referencedColumnName = "id")
    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @ManyToOne
    @JoinColumn(name = "id_reserva", referencedColumnName = "id")
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
