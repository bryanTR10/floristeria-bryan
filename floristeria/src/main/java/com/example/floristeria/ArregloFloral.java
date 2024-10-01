package com.example.floristeria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ArregloFloral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String follaje;
    private String elementosDecorativos;
    private Double precio;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFollaje() {
        return follaje;
    }

    public void setFollaje(String follaje) {
        this.follaje = follaje;
    }

    public String getElementosDecorativos() {
        return elementosDecorativos;
    }

    public void setElementosDecorativos(String elementosDecorativos) {
        this.elementosDecorativos = elementosDecorativos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
