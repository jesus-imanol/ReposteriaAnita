package com.jesuscast.reposteriaanita.models;

public class Gelatina extends Producto {
    private String size;
    private String sabor;
    public Gelatina(){}

    public Gelatina(String nombreProducto, int cantidad, double precio, String size, String sabor) {
        super(nombreProducto, cantidad, precio);
        this.size = size;
        this.sabor = sabor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
