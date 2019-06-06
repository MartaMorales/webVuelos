package database;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Vuelo {
    private int id;
    private Integer idAeropuertoSalida;
    private Integer idAeropuertoLlegada;
    private Timestamp horaSalida;
    private Timestamp horaLlegada;
    private Integer idAvion;
    private Collection<ReservaVuelo> reservaVuelosById;
    private Aeropuerto aeropuertoByIdAeropuertoSalida;
    private Aeropuerto aeropuertoByIdAeropuertoLlegada;
    private Avion avionByIdAvion;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_aeropuerto_salida")
    public Integer getIdAeropuertoSalida() {
        return idAeropuertoSalida;
    }

    public void setIdAeropuertoSalida(Integer idAeropuertoSalida) {
        this.idAeropuertoSalida = idAeropuertoSalida;
    }

    @Basic
    @Column(name = "id_aeropuerto_llegada")
    public Integer getIdAeropuertoLlegada() {
        return idAeropuertoLlegada;
    }

    public void setIdAeropuertoLlegada(Integer idAeropuertoLlegada) {
        this.idAeropuertoLlegada = idAeropuertoLlegada;
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
        Vuelo vuelo = (Vuelo) o;
        return id == vuelo.id &&
                Objects.equals(idAeropuertoSalida, vuelo.idAeropuertoSalida) &&
                Objects.equals(idAeropuertoLlegada, vuelo.idAeropuertoLlegada) &&
                Objects.equals(horaSalida, vuelo.horaSalida) &&
                Objects.equals(horaLlegada, vuelo.horaLlegada) &&
                Objects.equals(idAvion, vuelo.idAvion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idAeropuertoSalida, idAeropuertoLlegada, horaSalida, horaLlegada, idAvion);
    }

    @OneToMany(mappedBy = "vueloByIdVuelo")
    public Collection<ReservaVuelo> getReservaVuelosById() {
        return reservaVuelosById;
    }

    public void setReservaVuelosById(Collection<ReservaVuelo> reservaVuelosById) {
        this.reservaVuelosById = reservaVuelosById;
    }

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_salida", referencedColumnName = "id")
    public Aeropuerto getAeropuertoByIdAeropuertoSalida() {
        return aeropuertoByIdAeropuertoSalida;
    }

    public void setAeropuertoByIdAeropuertoSalida(Aeropuerto aeropuertoByIdAeropuertoSalida) {
        this.aeropuertoByIdAeropuertoSalida = aeropuertoByIdAeropuertoSalida;
    }

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_llegada", referencedColumnName = "id")
    public Aeropuerto getAeropuertoByIdAeropuertoLlegada() {
        return aeropuertoByIdAeropuertoLlegada;
    }

    public void setAeropuertoByIdAeropuertoLlegada(Aeropuerto aeropuertoByIdAeropuertoLlegada) {
        this.aeropuertoByIdAeropuertoLlegada = aeropuertoByIdAeropuertoLlegada;
    }

    @ManyToOne
    @JoinColumn(name = "id_avion", referencedColumnName = "id")
    public Avion getAvionByIdAvion() {
        return avionByIdAvion;
    }

    public void setAvionByIdAvion(Avion avionByIdAvion) {
        this.avionByIdAvion = avionByIdAvion;
    }
}
