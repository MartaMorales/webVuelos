package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Reserva {
    private Integer id;
    private Collection<PasajeroReserva> pasajeroReservas;
    private Cliente cliente;
    private Collection<ReservaVuelo> reservaVuelos;

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
        Reserva reserva = (Reserva) o;
        return Objects.equals(id, reserva.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @OneToMany(mappedBy = "reserva")
    public Collection<PasajeroReserva> getPasajeroReservas() {
        return pasajeroReservas;
    }

    public void setPasajeroReservas(Collection<PasajeroReserva> pasajeroReservas) {
        this.pasajeroReservas = pasajeroReservas;
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @OneToMany(mappedBy = "reserva")
    public Collection<ReservaVuelo> getReservaVuelos() {
        return reservaVuelos;
    }

    public void setReservaVuelos(Collection<ReservaVuelo> reservaVuelos) {
        this.reservaVuelos = reservaVuelos;
    }
}
