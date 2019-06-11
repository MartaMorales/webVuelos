package com.camaras.wiku.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tarjeta_de_credito", schema = "wiku_airlines", catalog = "")
public class TarjetaDeCredito {
    private Integer id;
    private Integer numeroTarjeta;
    private Date fechaCaducidad;
    private Integer cvv;
    private String tipo;
    private Cliente cliente;

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
    @Column(name = "numero_tarjeta")
    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Basic
    @Column(name = "fecha_caducidad")
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Basic
    @Column(name = "cvv")
    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    @Basic
    @Column(name = "tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarjetaDeCredito that = (TarjetaDeCredito) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(numeroTarjeta, that.numeroTarjeta) &&
                Objects.equals(fechaCaducidad, that.fechaCaducidad) &&
                Objects.equals(cvv, that.cvv) &&
                Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroTarjeta, fechaCaducidad, cvv, tipo);
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
