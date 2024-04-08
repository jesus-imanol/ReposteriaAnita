package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DeleteSuppliesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitBtn;

    @FXML
    private TextField idSearchSupplies;

    @FXML
    private Button deleteSuppliesBtn;

    @FXML
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    @FXML
    void onClickDeleteSupplies(MouseEvent event) {
        if (idSearchSupplies.getText().trim().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Por favor ingrese una ID");
            alert.showAndWait();
        }
        else {
            String id= idSearchSupplies.getText();
            if (AppReposteria.getReposteria().eliminarInsumo(id)){
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Éxito");
                alert.setContentText("Insumo eliminado con éxito");
                alert.showAndWait();
            }
            else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("No existe ningún producto con esta ID");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void initialize() {

    }

}
