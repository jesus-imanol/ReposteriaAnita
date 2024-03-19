package com.jesuscast.reposteriaanita.models;

public class Insumo {
    String nombre;
    String unidadMedida;
    public Insumo(){}
    public Insumo(String nombre, String unidadMedida) {
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}
