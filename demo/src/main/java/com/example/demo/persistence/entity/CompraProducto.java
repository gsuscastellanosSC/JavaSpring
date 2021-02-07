package com.example.demo.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="compras_productos")
public class CompraProducto {
    @EmbeddedId
    private CompraProductoPK id;

    private Integer cantidad;
    private Double total;
    private boolean estado;

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
