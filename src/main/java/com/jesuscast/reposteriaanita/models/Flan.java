package com.jesuscast.reposteriaanita.models;

public class Flan extends Producto {
    private int cantidadPersonas;
    private String desing;
    public Flan(){}

    public Flan(String nombreProducto, int cantidad, int precio, int cantidadPersonas, String desing) {
        super(nombreProducto, cantidad, precio);
        this.cantidadPersonas = cantidadPersonas;
        this.desing = desing;
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
