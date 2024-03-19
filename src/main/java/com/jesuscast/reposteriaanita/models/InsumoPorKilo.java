package com.jesuscast.reposteriaanita.models;

import com.jesuscast.reposteriaanita.models.Insumo;

public class InsumoPorKilo extends Insumo {
    private double cantidad;

    public InsumoPorKilo(String nombre, String unidadMedida, double cantidad) {
        super(nombre, unidadMedida);
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void sumarCantidad(double cantidad){
        this.cantidad=this.cantidad+cantidad;
    }
    public boolean restarCantidad(double cantidad){
        boolean fallo;
        if(cantidad <= this.cantidad){
            this.cantidad=this.cantidad-cantidad;
            fallo=true;
        }
        else {
            fallo=false;
        }
        return fallo;
    }
}
