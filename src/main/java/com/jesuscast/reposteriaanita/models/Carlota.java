package com.jesuscast.reposteriaanita.models;

public class Carlota extends Producto {
    private String desing;
    private String tipo;
    public Carlota(){}
    public Carlota(String nombreProducto, int cantidad, int precio, String desing, String tipo) {
        super(nombreProducto, cantidad, precio);
        this.desing = desing;
        this.tipo = tipo;
    }

    public String getDesing() {
        return desing;
    }

    public void setDesing(String desing) {
        this.desing = desing;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
