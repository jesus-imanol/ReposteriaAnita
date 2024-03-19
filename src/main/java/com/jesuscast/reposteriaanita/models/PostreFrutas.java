package com.jesuscast.reposteriaanita.models;

public class PostreFrutas extends Producto {
    private String desing;
    public PostreFrutas(){}

    public PostreFrutas(String nombreProducto, int cantidad, int precio, String desing) {
        super(nombreProducto, cantidad, precio);
        this.desing = desing;
    }

    public String getDesing() {
        return desing;
    }

    public void setDesing(String desing) {
        this.desing = desing;
    }
}
