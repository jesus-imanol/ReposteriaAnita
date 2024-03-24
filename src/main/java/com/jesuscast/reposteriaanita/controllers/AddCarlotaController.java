package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import com.jesuscast.reposteriaanita.models.Carlota;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddCarlotaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addProductImage;

    @FXML
    private TextField amountInput;

    @FXML
    private ImageView exitImage;


    @FXML
    private TextField nameInput;

    @FXML
    private TextField priceInput;

    @FXML
    private TextField sizeInput;

    @FXML
    private TextField typeInput;

    @FXML
    void onClickAddProduct(MouseEvent event) {
        if (amountInput.getText().trim().isEmpty()||
                nameInput.getText().trim().isEmpty() ||
                priceInput.getText().trim().isEmpty() ||
                typeInput.getText().trim().isEmpty() || sizeInput.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Se requieren datos");
            alert.setContentText("Por favor complete los campos");
            alert.showAndWait();
        }
        //Somer aqui agregaras el producto
        else {
           String nombre=nameInput.getText();
           String tipo=typeInput.getText();
           String size=sizeInput.getText();
           int cantidad;
           double precio;
           try{
               cantidad=Integer.parseInt(amountInput.getText());
               precio=Double.parseDouble(priceInput.getText());
               Carlota carlota=new Carlota(nombre, cantidad, precio, size, tipo);
               if (AppReposteria.getReposteria().addCarlota(carlota)){
                   Alert alert = new Alert(Alert.AlertType.INFORMATION);
                   alert.setTitle("Exito");
                   alert.setContentText("Guardado exitosamente");
                   alert.showAndWait();
               }
               else {
                   Alert alert = new Alert(Alert.AlertType.INFORMATION);
                   alert.setTitle("Error");
                   alert.setContentText("Ha habido un error al guardar, intente de nuevo, por favor");
                   alert.showAndWait();
               }

           }
           catch (Exception e){
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
               alert.setTitle("Error");
               alert.setContentText("Error al guardar datos, ingrese solo valores númericos"+e.getMessage());
               alert.showAndWait();
           }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos");
            alert.setContentText("Datos guardados correctamente");
            alert.showAndWait();
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
        addValidator(nameInput);
        addValidator(typeInput);
        addValidator(sizeInput);
        addValidator(priceInput);
    }

}
