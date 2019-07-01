package com.camaras.wiku.model;

import com.camaras.wiku.model.enums.TipoReserva;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "reserva")
public class Reserva {
    private Integer id;
    private Date fechaLlegada;
    private Date fechaSalida;
    private Double precio;
    private TipoReserva tipo;
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

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Enumerated(EnumType.STRING)
    public TipoReserva getTipo() {
        return tipo;
    }

    public void setTipo(TipoReserva tipo) {
        this.tipo = tipo;
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

