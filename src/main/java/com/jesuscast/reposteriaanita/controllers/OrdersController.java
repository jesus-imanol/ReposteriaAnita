package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class OrdersController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addPedidoImage;

    @FXML
    private ImageView deletePedidoImage;

    @FXML
    private Button exitBtn;

    @FXML
    private ImageView seePedidoImage;

    @FXML
    private ImageView updatePedidoImage;

    @FXML
    void OnClickSeePedido(MouseEvent event) {

    }

    @FXML
    void onClickAddPedido(MouseEvent event) {

    }

    @FXML
    void onClickDeletePedido(MouseEvent event) {

    }

    @FXML
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickUpdatePedido(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}

