package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.Reposteria;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addProductImage;

    @FXML
    private ImageView deleteProductImage;

    @FXML
    private ImageView returnImage;

    @FXML
    private ImageView seeProductImage;

    @FXML
    private ImageView updateProductImage;

    @FXML
    void onClickAddProduct(MouseEvent event) {
        Reposteria.newStage("menu-products-view","Agregar productos");
    }

    @FXML
    void onClickDeleteProduct(MouseEvent event) {
        Reposteria.newStage("delete-product-view","Eliminar producto");
    }

    @FXML
    void onClickReturnHome(MouseEvent event) {

    }

    @FXML
    void onClickSeeProduct(MouseEvent event) {
        Reposteria.newStage("see-products-view","Ver productos");
    }

    @FXML
    void onClickUpdateProduct(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}
