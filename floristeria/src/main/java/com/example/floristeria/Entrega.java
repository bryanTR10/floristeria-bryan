package com.example.floristeria;

import com.example.floristeria.EstadoEntrega;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Pedido pedido;
    private Conductor conductor;
    private String rutaEntrega;
    private EstadoEntrega estado;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getRutaEntrega() {
        return rutaEntrega;
    }

    public void setRutaEntrega(String rutaEntrega) {
        this.rutaEntrega = rutaEntrega;
    }

    public EstadoEntrega getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntrega estado) {
        this.estado = estado;
    }
}
