package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AddOrdersInPremisesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addOrdersBtn;

    @FXML
    private TextField clienteOrderinput;

    @FXML
    private DatePicker dateCollected;

    @FXML
    private DatePicker dateOrderDatePicker;

    @FXML
    private TextField designProduct;

    @FXML
    private Button exitBtn;

    @FXML
    private TextField nameProductPeopleInput;

    @FXML
    private TextField premisesCollected;

    @FXML
    private ComboBox<?> statusOrderComboBox;

    @FXML
    private TextField timeCollectedInput;

    @FXML
    private TextField timeOrderInput;

    @FXML
    void onClickAddOrders(MouseEvent event) {

    }

    @FXML
    void onClickExit(MouseEvent event) {

    }

    @FXML
    void initialize() {
 
    }

}
