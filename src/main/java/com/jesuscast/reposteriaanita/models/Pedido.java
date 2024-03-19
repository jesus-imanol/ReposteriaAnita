package com.jesuscast.reposteriaanita.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    protected int id;
    protected String nombreCliente;
    protected LocalDate fechaDePedido;
    protected LocalTime horaDePedido;
    protected String descripciónProducto;
    protected String productDesing;
    protected String status;
    public Pedido(){}
    public Pedido(String nombreCliente, LocalDate fechaDePedido, LocalTime horaDePedido, String descripciónProducto, String productDesing, String status) {
        this.id=(int)(Math.random()*899+100);
        this.nombreCliente = nombreCliente;
        this.fechaDePedido = fechaDePedido;
        this.horaDePedido = horaDePedido;
        this.descripciónProducto = descripciónProducto;
        this.productDesing = productDesing;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public LocalDate getFechaDePedido() {
        return fechaDePedido;
    }

    public void setFechaDePedido(LocalDate fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    public LocalTime getHoraDePedido() {
        return horaDePedido;
    }

    public void setHoraDePedido(LocalTime horaDePedido) {
        this.horaDePedido = horaDePedido;
    }

    public String getDescripciónProducto() {
        return descripciónProducto;
    }

    public void setDescripciónProducto(String descripciónProducto) {
        this.descripciónProducto = descripciónProducto;
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
