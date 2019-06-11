package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reserva_vuelo", schema = "wiku_airlines", catalog = "")
public class ReservaVuelo {
    private Integer id;
    private Reserva reserva;
    private Vuelo vuelo;

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
        ReservaVuelo that = (ReservaVuelo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToOne
    @JoinColumn(name = "id_reserva", referencedColumnName = "id")
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @ManyToOne
    @JoinColumn(name = "id_vuelo", referencedColumnName = "id")
    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
