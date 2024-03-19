package com.jesuscast.reposteriaanita.models;

import com.jesuscast.reposteriaanita.models.Insumo;

public class InsumosPorUnidad extends Insumo {
    private int cantidad;
    public InsumosPorUnidad(){}

    public InsumosPorUnidad(String nombre, String unidadMedida, int cantidad) {
        super(nombre, unidadMedida);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
