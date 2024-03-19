package com.jesuscast.reposteriaanita.models;

public class Producto {
    protected int id;
    protected String nombreProducto;
    protected int cantidad;
    protected double precio;
    public Producto(){}

    public Producto(String nombreProducto, int cantidad, int precio) {
        this.id =(int)(Math.random()*899+100);
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public void sumarCantidad(int cantidad){
        this.cantidad=this.cantidad+cantidad;
    }
    public boolean restarCantidad(int cantidad){
        boolean fallo;
        if(cantidad<=this.cantidad){
            this.cantidad=this.cantidad-cantidad;
            fallo=true;
        }
        else {
            fallo=false;
        }
        return fallo;
    }
}
