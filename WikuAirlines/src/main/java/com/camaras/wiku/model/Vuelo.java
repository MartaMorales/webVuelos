package com.camaras.wiku.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Vuelo {
    private Integer id;
    private Timestamp horaSalida;
    private Timestamp horaLlegada;
    private Collection<ReservaVuelo> reservaVuelos;
    private Aeropuerto aeropuertoSalida;
    private Aeropuerto aeropuertoLlegada;
    private Avion avion;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "hora_salida")
    public Timestamp getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Timestamp horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Basic
    @Column(name = "hora_llegada")
    public Timestamp getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Timestamp horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(id, vuelo.id) &&
                Objects.equals(horaSalida, vuelo.horaSalida) &&
                Objects.equals(horaLlegada, vuelo.horaLlegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, horaSalida, horaLlegada);
    }

    @OneToMany(mappedBy = "vuelo")
    public Collection<ReservaVuelo> getReservaVuelos() {
        return reservaVuelos;
    }

    public void setReservaVuelos(Collection<ReservaVuelo> reservaVuelos) {
        this.reservaVuelos = reservaVuelos;
    }

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_salida", referencedColumnName = "id")
    public Aeropuerto getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_llegada", referencedColumnName = "id")
    public Aeropuerto getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
        this.aeropuertoLlegada = aeropuertoLlegada;
    }

    @ManyToOne
    @JoinColumn(name = "id_avion", referencedColumnName = "id")
    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
