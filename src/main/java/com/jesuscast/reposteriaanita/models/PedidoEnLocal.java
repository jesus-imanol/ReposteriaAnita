package com.jesuscast.reposteriaanita.models;

import com.jesuscast.reposteriaanita.models.Pedido;

import java.time.LocalDate;
import java.time.LocalTime;
public class PedidoEnLocal extends Pedido {
    private LocalDate fechaRecogido;
    private LocalTime horaRecogido;
    private String localRecogido;
    public PedidoEnLocal(){}
    public PedidoEnLocal(String nombreCliente, LocalDate fechaDePedido, LocalTime horaDePedido, String descripciónProducto, String productDesing, String status, LocalDate fechaRecogido, LocalTime horaRecogido, String localRecogido) {
        super(nombreCliente, fechaDePedido, horaDePedido, descripciónProducto, productDesing, status);
        this.fechaRecogido = fechaRecogido;
        this.horaRecogido = horaRecogido;
        this.localRecogido = localRecogido;
    }

    public LocalDate getFechaRecogido() {
        return fechaRecogido;
    }

    public void setFechaRecogido(LocalDate fechaRecogido) {
        this.fechaRecogido = fechaRecogido;
    }

    public LocalTime getHoraRecogido() {
        return horaRecogido;
    }

    public void setHoraRecogido(LocalTime horaRecogido) {
        this.horaRecogido = horaRecogido;
    }

    public String getLocalRecogido() {
        return localRecogido;
    }

    public void setLocalRecogido(String localRecogido) {
        this.localRecogido = localRecogido;
    }
}
