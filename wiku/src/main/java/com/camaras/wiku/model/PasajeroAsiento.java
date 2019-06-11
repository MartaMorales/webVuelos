package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pasajero_asiento")
public class PasajeroAsiento {
    private Integer id;
    private Pasajero pasajero;
    private Asiento asiento;

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
        PasajeroAsiento that = (PasajeroAsiento) o;
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
    @JoinColumn(name = "id_asiento", referencedColumnName = "id")
    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
}
