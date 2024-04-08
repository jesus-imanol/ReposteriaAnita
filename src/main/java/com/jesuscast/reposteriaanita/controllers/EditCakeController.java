package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class EditCakeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField amountInput;

    @FXML
    private Button amountPersonEditBtn;

    @FXML
    private TextField amountPersonInput;

    @FXML
    private Button decreaseEditBtn;

    @FXML
    private Button designEditBtn;

    @FXML
    private TextField designInput;

    @FXML
    private ImageView exitImage;

    @FXML
    private ImageView imgCentral;

    @FXML
    private Button increaseEditBtn;

    @FXML
    private Button nameEditBtn;

    @FXML
    private TextField nameInput;

    @FXML
    private Button priceEditBtn;

    @FXML
    private TextField priceInput;

    @FXML
    private Button stuffedEditBtn;

    @FXML
    private TextField stuffedInput;

    @FXML
    void onClickDecrease(MouseEvent event) {

    }

    @FXML
    void onClickEditAmountPerson(MouseEvent event) {

    }

    @FXML
    void onClickEditDesign(MouseEvent event) {

    }

    @FXML
    void onClickEditName(MouseEvent event) {

    }

    @FXML
    void onClickEditPrice(MouseEvent event) {

    }

    @FXML
    void onClickEditStuffed(MouseEvent event) {

    }

    @FXML
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickIncrease(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}
