package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class SuperAdminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView clientesImage;

    @FXML
    private ImageView insumosImage;

    @FXML
    private ImageView pedidosImage;

    @FXML
    private ImageView productosImage;

    @FXML
    private ImageView ventasImage;

    @FXML
    void onClickClientes(MouseEvent event) {
        AppReposteria.newStage("clientes-view","Clientes");
    }

    @FXML
    void onClickInsumos(MouseEvent event) {

    }

    @FXML
    void onClickPedidos(MouseEvent event) {

    }

    @FXML
    void onClickProductos(MouseEvent event) {
        AppReposteria.newStage("productos-view","Productos");
    }

    @FXML
    void onClickSalir(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void onClickVentas(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}
