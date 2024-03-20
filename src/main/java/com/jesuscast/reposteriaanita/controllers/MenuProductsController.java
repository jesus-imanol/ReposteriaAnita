package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.Reposteria;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MenuProductsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView carlotaImage;

    @FXML
    private ImageView cupcakeImage;

    @FXML
    private ImageView exitImage;

    @FXML
    private ImageView flanImage;

    @FXML
    private ImageView gelatinaImage;

    @FXML
    private ImageView pastelImage;

    @FXML
    private ImageView postreFrutasImage;

    @FXML
    void onClickCarlota(MouseEvent event) {

    }

    @FXML
    void onClickCupcake(MouseEvent event) {
        Reposteria.newStage("add-cupcake-view","Agregar cupcake");
    }

    @FXML
    void onClickExit(MouseEvent event) {

    }

    @FXML
    void onClickFlan(MouseEvent event) {

    }

    @FXML
    void onClickGelatina(MouseEvent event) {

    }

    @FXML
    void onClickPastel(MouseEvent event) {
        Reposteria.newStage("add-cake-view","Agregar pastel");
    }

    @FXML
    void onClickPostreFrutas(MouseEvent event) {
        Reposteria.getStageView().close();
    }

    @FXML
    void initialize() {

    }

}
