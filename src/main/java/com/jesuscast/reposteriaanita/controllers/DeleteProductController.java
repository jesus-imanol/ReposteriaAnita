package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import com.jesuscast.reposteriaanita.Reposteria;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class DeleteProductController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView deleteProduct;

    @FXML
    private ImageView exitImage;

    @FXML
    private TextField nameProductDeleteImage;

    @FXML
    void onClickDeleteProduct(MouseEvent event) {

    }

    @FXML
    void onClickExit(MouseEvent event) {
        AppReposteria.getStageView().close();
    }

    @FXML
    void onClickNameProductDeleteImage(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}