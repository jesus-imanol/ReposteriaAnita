package com.jesuscast.reposteriaanita.models;

import com.jesuscast.reposteriaanita.models.Pedido;

import java.time.LocalDate;
import java.time.LocalTime;

public class PedidoADomicilio extends Pedido {
    private String nombreDomicilio;
    private double costoEnvio;
    private String referncia;
    public PedidoADomicilio(){}
    public PedidoADomicilio(String nombreCliente, LocalDate fechaDePedido, LocalTime horaDePedido, String descripciónProducto, String productDesing, String status, String nombreDomicilio, double costoEnvio, String referncia) {
        super(nombreCliente, fechaDePedido, horaDePedido, descripciónProducto, productDesing, status);
        this.nombreDomicilio = nombreDomicilio;
        this.costoEnvio = costoEnvio;
        this.referncia = referncia;
    }

    public String getNombreDomicilio() {
        return nombreDomicilio;
    }

    public void setNombreDomicilio(String nombreDomicilio) {
        this.nombreDomicilio = nombreDomicilio;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public String getReferncia() {
        return referncia;
    }

    public void setReferncia(String referncia) {
        this.referncia = referncia;
    }
}
