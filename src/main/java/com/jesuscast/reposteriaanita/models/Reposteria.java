package com.jesuscast.reposteriaanita.models;

import java.util.ArrayList;

public class Reposteria {
        private ArrayList<Pedido> listaPedidos = new ArrayList<>();
        private ArrayList<Pastel> listaProductosPastel = new ArrayList<>();
        private ArrayList<Carlota> listaProductosCarlota = new ArrayList<>();
        private ArrayList<Cupcake> listaProductosCupcake = new ArrayList<>();
        private ArrayList<Flan> listaProductosFlan = new ArrayList<>();
        private ArrayList<Gelatina> listaProductosGelatina = new ArrayList<>();
        private ArrayList<PostreFrutas> listaProductosPostreFrutas = new ArrayList<>();
        private ArrayList<Cliente> listaClientes = new ArrayList<>();
        private ArrayList<Insumo> listaInsumos = new ArrayList<>();

        public boolean addPedido(Pedido pedido) {
                return listaPedidos.add(pedido);
        }

        public boolean addPastel(Pastel pastel) {
                return listaProductosPastel.add(pastel);
        }

        public boolean addCarlota(Carlota carlota) {
                return listaProductosCarlota.add(carlota);
        }

        public boolean addCupcake(Cupcake cupcake) {
                return listaProductosCupcake.add(cupcake);
        }

        public boolean addFlan(Flan flan) {
                return listaProductosFlan.add(flan);
        }

        public boolean addGelatina(Gelatina gelatina) {
                return listaProductosGelatina.add(gelatina);
        }

        public boolean addPostreFrutas(PostreFrutas postreFrutas) {
                return listaProductosPostreFrutas.add(postreFrutas);
        }

        public boolean addCliente(Cliente cliente) {
                return listaClientes.add(cliente);
        }

        public boolean addInsumo(Insumo insumo) {
                return listaInsumos.add(insumo);
        }

        public ArrayList<Pedido> getListaPedidos() {
                return listaPedidos;
        }

        public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
                this.listaPedidos = listaPedidos;
        }

        public ArrayList<Pastel> getListaProductosPastel() {
                return listaProductosPastel;
        }

        public void setListaProductosPastel(ArrayList<Pastel> listaProductosPastel) {
                this.listaProductosPastel = listaProductosPastel;
        }

        public ArrayList<Carlota> getListaProductosCarlota() {
                return listaProductosCarlota;
        }

        public void setListaProductosCarlota(ArrayList<Carlota> listaProductosCarlota) {
                this.listaProductosCarlota = listaProductosCarlota;
        }

        public ArrayList<Cupcake> getListaProductosCupcake() {
                return listaProductosCupcake;
        }

        public void setListaProductosCupcake(ArrayList<Cupcake> listaProductosCupcake) {
                this.listaProductosCupcake = listaProductosCupcake;
        }

        public ArrayList<Flan> getListaProductosFlan() {
                return listaProductosFlan;
        }

        public void setListaProductosFlan(ArrayList<Flan> listaProductosFlan) {
                this.listaProductosFlan = listaProductosFlan;
        }

        public ArrayList<Gelatina> getListaProductosGelatina() {
                return listaProductosGelatina;
        }

        public void setListaProductosGelatina(ArrayList<Gelatina> listaProductosGelatina) {
                this.listaProductosGelatina = listaProductosGelatina;
        }

        public ArrayList<PostreFrutas> getListaProductosPostreFrutas() {
                return listaProductosPostreFrutas;
        }

        public void setListaProductosPostreFrutas(ArrayList<PostreFrutas> listaProductosPostreFrutas) {
                this.listaProductosPostreFrutas = listaProductosPostreFrutas;
        }

        public ArrayList<Cliente> getListaClientes() {
                return listaClientes;
        }

        public void setListaClientes(ArrayList<Cliente> listaClientes) {
                this.listaClientes = listaClientes;
        }

        public ArrayList<Insumo> getListaInsumos() {
                return listaInsumos;
        }

        public void setListaInsumos(ArrayList<Insumo> listaInsumos) {
                this.listaInsumos = listaInsumos;
        }
}
