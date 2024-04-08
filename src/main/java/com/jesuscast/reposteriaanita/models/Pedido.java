package com.jesuscast.reposteriaanita.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Pedido {
    protected String id;
    protected String nombreCliente;
    protected LocalDate fechaDeEntrega;
    protected LocalTime horaDeEntrega;
    protected String productDesing;
    protected String nombreProducto;
    protected String status;
    public Pedido(){}
    public Pedido(String nombreCliente, LocalDate fechaDeEntrega, LocalTime horaDeEntrega,String productDesing, String status, String nombreProducto) {
        this.id= UUID.randomUUID().toString();
        this.nombreCliente = nombreCliente;
        this.fechaDeEntrega = fechaDeEntrega;
        this.horaDeEntrega= horaDeEntrega;
        this.productDesing = productDesing;
        this.status = status;
        this.nombreProducto=nombreProducto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public LocalDate getFechaDePedido() {
        return fechaDeEntrega;
    }

    public void setFechaDePedido(LocalDate fechaDePedido) {
        this.fechaDeEntrega = fechaDePedido;
    }

    public LocalTime getHoraDePedido() {
        return horaDeEntrega;
    }

    public void setHoraDePedido(LocalTime horaDePedido) {
        this.horaDeEntrega = horaDePedido;
    }

    public String getProductDesing() {
        return productDesing;
    }

    public void setProductDesing(String productDesing) {
        this.productDesing = productDesing;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
