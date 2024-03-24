package com.jesuscast.reposteriaanita.models;

public class Carlota extends Producto {
    private String size;
    private String tipo;
    public Carlota(){}
    public Carlota(String nombreProducto, int cantidad, double precio, String size, String tipo) {
        super(nombreProducto, cantidad, precio);
        this.size=size;
        this.tipo = tipo;
    }

    public String getDesing() {
        return size;
    }

    public void setDesing(String desing) {
        this.size = desing;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
