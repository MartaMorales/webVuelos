package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "asiento")
public class Asiento {
    private Integer id;
    private String numero;
    private Avion avion;
    private Collection<PasajeroAsiento> pasajeroAsientos;

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
    @Column(name = "numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return Objects.equals(id, asiento.id) &&
                Objects.equals(numero, asiento.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero);
    }

    @ManyToOne
    @JoinColumn(name = "id_avion", referencedColumnName = "id")
    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @OneToMany(mappedBy = "asiento")
    public Collection<PasajeroAsiento> getPasajeroAsientos() {
        return pasajeroAsientos;
    }

    public void setPasajeroAsientos(Collection<PasajeroAsiento> pasajeroAsientos) {
        this.pasajeroAsientos = pasajeroAsientos;
    }
}
