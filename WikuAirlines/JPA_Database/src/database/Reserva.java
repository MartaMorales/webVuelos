package database;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Reserva {
    private int id;
    private Integer idCliente;
    private Collection<PasajeroReserva> pasajeroReservasById;
    private Cliente clienteByIdCliente;
    private Collection<ReservaVuelo> reservaVuelosById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_cliente")
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return id == reserva.id &&
                Objects.equals(idCliente, reserva.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCliente);
    }

    @OneToMany(mappedBy = "reservaByIdReserva")
    public Collection<PasajeroReserva> getPasajeroReservasById() {
        return pasajeroReservasById;
    }

    public void setPasajeroReservasById(Collection<PasajeroReserva> pasajeroReservasById) {
        this.pasajeroReservasById = pasajeroReservasById;
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    public Cliente getClienteByIdCliente() {
        return clienteByIdCliente;
    }

    public void setClienteByIdCliente(Cliente clienteByIdCliente) {
        this.clienteByIdCliente = clienteByIdCliente;
    }

    @OneToMany(mappedBy = "reservaByIdReserva")
    public Collection<ReservaVuelo> getReservaVuelosById() {
        return reservaVuelosById;
    }

    public void setReservaVuelosById(Collection<ReservaVuelo> reservaVuelosById) {
        this.reservaVuelosById = reservaVuelosById;
    }
}
