package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
        if (amountProductoInput.getText().trim().isEmpty() ||
                idProductInput.getText().trim().isEmpty() ||
                nameProductInput.getText().trim().isEmpty() ||
                priceProductInput.getText().trim().isEmpty() ||
                typeProductInput.getText().trim().isEmpty()) {
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
        AppReposteria.getStageView().close();
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
        addValidator(amountProductoInput);
        addValidator(idProductInput);
        addValidator(nameProductInput);
        addValidator(priceProductInput);
        addValidator(typeProductInput);
    }

}
