package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class AddProductsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addProductImage;

    @FXML
    private TextField amountProductoInput;

    @FXML
    private ImageView exitImage;

    @FXML
    private TextField idProductInput;

    @FXML
    private TextField nameProductInput;

    @FXML
    private TextField priceProductInput;

    @FXML
    private TextField typeProductInput;

    @FXML
    void onClickAddProduct(MouseEvent event) {

    }

    @FXML
    void onClickExit(MouseEvent event) {
        AppReposteria.getStageView().close();
    }

    @FXML
    void initialize() {

    }

}
