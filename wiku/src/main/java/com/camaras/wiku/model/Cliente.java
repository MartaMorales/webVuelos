package com.camaras.wiku.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private Date fechaNacimiento;
    private Integer telefono;
    private String direccion;
    private Integer codigoPostal;
    private Ciudad ciudad;
    private Pais pais;
    private Collection<Reserva> reservas;
    private Collection<TarjetaDeCredito> tarjetas;
    private Collection<Login> loginsById;

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
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido1")
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    @Basic
    @Column(name = "apellido2")
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Basic
    @Column(name = "dni")
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Basic
    @Column(name = "fecha_nacimiento")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "telefono")
    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "codigo_postal")
    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) &&
                Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(apellido1, cliente.apellido1) &&
                Objects.equals(apellido2, cliente.apellido2) &&
                Objects.equals(dni, cliente.dni) &&
                Objects.equals(fechaNacimiento, cliente.fechaNacimiento) &&
                Objects.equals(telefono, cliente.telefono) &&
                Objects.equals(direccion, cliente.direccion) &&
                Objects.equals(codigoPostal, cliente.codigoPostal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido1, apellido2, dni, fechaNacimiento, telefono, direccion, codigoPostal);
    }

    @ManyToOne
    @JoinColumn(name = "id_ciudad", referencedColumnName = "id")
    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @ManyToOne
    @JoinColumn(name = "id_pais", referencedColumnName = "id")
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @OneToMany(mappedBy = "cliente")
    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

    @OneToMany(mappedBy = "cliente")
    public Collection<TarjetaDeCredito> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(Collection<TarjetaDeCredito> tarjetas) {
        this.tarjetas = tarjetas;
    }

    @OneToMany(mappedBy = "cliente")
    public Collection<Login> getLoginsById() {
        return loginsById;
    }

    public void setLoginsById(Collection<Login> loginsById) {
        this.loginsById = loginsById;
    }
}
