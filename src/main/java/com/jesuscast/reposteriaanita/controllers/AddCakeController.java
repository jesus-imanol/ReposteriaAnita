package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import com.jesuscast.reposteriaanita.models.Pastel;
import com.jesuscast.reposteriaanita.models.Reposteria;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddCakeController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addProductImage;

    @FXML
    private TextField amountInput;

    @FXML
    private TextField amountPersonInput;

    @FXML
    private TextField designInput;

    @FXML
    private ImageView exitImage;


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
                nameInput.getText().trim().isEmpty() ||
                priceInput.getText().trim().isEmpty() ||
                typeInput.getText().trim().isEmpty() ||amountPersonInput.getText().isEmpty()
                || designInput.getText().isEmpty() || stuffedInput.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Se requieren datos");
            alert.setContentText("Por favor complete los campos");
            alert.showAndWait();
        }
        //Somer aqui agregaras el producto
        else {
          String nombre = nameInput.getText();
            String relleno=stuffedInput.getText();
            String desing=designInput.getText();
          try {
              int cantidad = Integer.parseInt(amountInput.getText());
              double precio = Double.parseDouble(priceInput.getText());
              int cantidadPersonas = Integer.parseInt(amountPersonInput.getText());
              Pastel pastel = new Pastel(nombre,cantidad, precio, cantidadPersonas,relleno,desing);

              if (AppReposteria.getReposteria().addPastel(pastel)){
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                 alert.setTitle("Exito");
                 alert.setContentText("Pedido agregado con éxito");
                 alert.showAndWait();
              }
              else {
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Error");
                  alert.setContentText("Fallo al guardar, por favor intente de nuevo");
                  alert.showAndWait();
              }
          }
          catch (Exception e){
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
              alert.setTitle("Error al guardar datos");
              alert.setContentText("Se requieran valor númericos, no caracteres"+e.getMessage());
              alert.showAndWait();
          }
        }
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
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        addValidator(amountInput);
        addValidator(amountPersonInput);
        addValidator(priceInput);
        addValidator(nameInput);
        addValidator(typeInput);
        addValidator(designInput);
        addValidator(stuffedInput);
    }

}
