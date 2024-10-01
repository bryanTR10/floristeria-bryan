package com.example.floristeria;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.example.floristeria.EstadoPedido;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clienteNombre;
    private String clienteDireccion;
    private String clienteInformacionContacto;
    private String tipoArregloFloral;
    private String ocasion;
    private Date fechaEntrega;
    private Double presupuesto;
    private EstadoPedido estado;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String getClienteDireccion() {
        return clienteDireccion;
    }

    public void setClienteDireccion(String clienteDireccion) {
        this.clienteDireccion = clienteDireccion;
    }

    public String getClienteInformacionContacto() {
        return clienteInformacionContacto;
    }

    public void setClienteInformacionContacto(String clienteInformacionContacto) {
        this.clienteInformacionContacto = clienteInformacionContacto;
    }

    public String getTipoArregloFloral() {
        return tipoArregloFloral;
    }

    public void setTipoArregloFloral(String tipoArregloFloral) {
        this.tipoArregloFloral = tipoArregloFloral;
    }

    public String getOcasion() {
        return ocasion;
    }

    public void setOcasion(String ocasion) {
        this.ocasion = ocasion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
}
