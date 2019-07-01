package com.camaras.wiku.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "oferta")
public class Oferta {
    private Integer id;
    private String descripcion;
    private Double precio;
    private String imgUrl;
    private Vuelo vuelo;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "precio")
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta = (Oferta) o;
        return Objects.equals(id, oferta.id) &&
                Objects.equals(descripcion, oferta.descripcion) &&
                Objects.equals(precio, oferta.precio) &&
                Objects.equals(imgUrl, oferta.imgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion, precio, imgUrl);
    }

    @OneToOne
    @JoinColumn(name = "id_vuelo", referencedColumnName = "id")
    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
