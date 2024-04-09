package com.jesuscast.reposteriaanita.models;

public class Flan extends Producto {
    private int cantidadPersonas;
    private String desing;
    private String size;
    public Flan(String nombreProducto, int cantidad, double precio,int cantidadPersonas, String desing, String size) {
        super(nombreProducto, cantidad, precio);
        this.cantidadPersonas = cantidadPersonas;
        this.desing = desing;
        this.size=size;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getDesing() {
        return desing;
    }

    public void setDesing(String desing) {
        this.desing = desing;
    }
}
