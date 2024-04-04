package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class UpdateSuppliesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ediUnitComboBox;

    @FXML
    private Button editNameBtn;

    @FXML
    private Button editUnitExtentBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private TextField nameInsumoInput;

    @FXML
    private TextField idSearchSupplies;

    @FXML
    private ComboBox<String> unitComboBox;

    @FXML
    private TextField unitExtentInput;

    @FXML
    void onClickEditName(MouseEvent event) {

    }

    @FXML
    void onClickEditUnit(MouseEvent event) {

    }

    @FXML
    void onClickEditUnitExtent(MouseEvent event) {

    }

    @FXML
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        unitComboBox.getItems().addAll("Kilo","Unidad","Litro");
    }

}
