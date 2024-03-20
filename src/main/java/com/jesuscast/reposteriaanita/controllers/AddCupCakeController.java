package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.Reposteria;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class AddCupCakeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addProductImage;

    @FXML
    private TextField amountInput;

    @FXML
    private TextField designInput;

    @FXML
    private ImageView exitImage;

    @FXML
    private TextField idInput;

    @FXML
    private TextField nameInput;

    @FXML
    private TextField priceInput;

    @FXML
    private TextField stuffedInput;

    @FXML
    private TextField typeInput;

    @FXML
    void onClickAddProduct(MouseEvent event) {
        if (amountInput.getText().trim().isEmpty() ||
                idInput.getText().trim().isEmpty() ||
                nameInput.getText().trim().isEmpty() ||
                priceInput.getText().trim().isEmpty() ||
                typeInput.getText().trim().isEmpty() || designInput.getText().isEmpty() || stuffedInput.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Se requieren datos");
            alert.setContentText("Por favor complete los campos");
            alert.showAndWait();
        }
        //Somer aqui agregaras el producto
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos");
            alert.setContentText("Datos guardados correctamente");
            alert.showAndWait();
        }
    }

    @FXML
    void onClickExit(MouseEvent event) {
        Reposteria.getStageView().close();
    }
    private void addValidator(TextField field) {
        field.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (newValue.trim().isEmpty()) {
                    field.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
                } else {
                    field.setStyle("");
                }
            }
        });
    }
    @FXML
    void initialize() {
        addValidator(amountInput);
        addValidator(priceInput);
        addValidator(nameInput);
        addValidator(idInput);
        addValidator(typeInput);
        addValidator(designInput);
        addValidator(stuffedInput);
    }

}
