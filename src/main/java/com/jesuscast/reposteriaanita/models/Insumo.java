package com.jesuscast.reposteriaanita.models;

import java.util.UUID;

public class Insumo {
    String nombre;
    String unidadMedida;
    String id;
    private boolean status;

    public Insumo(){}
    public Insumo(String nombre, String unidadMedida) {
        this.nombre = nombre;
        this.id= UUID.randomUUID().toString();
        this.status=true;
        this.unidadMedida=unidadMedida;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
