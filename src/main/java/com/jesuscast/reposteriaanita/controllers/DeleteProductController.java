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
    private TextField nameProductDelete;

    @FXML
    void onClickDeleteProduct(MouseEvent event) {
        if (nameProductDelete.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Se requieren datos");
            alert.setContentText("Por favor complete los campos");
            alert.showAndWait();
        }
        //Aqui se eliminara el producto somer suan
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Datos");
            alert.setContentText("Datos guardados exitosamente");
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
        addValidator(nameProductDelete);
    }

}