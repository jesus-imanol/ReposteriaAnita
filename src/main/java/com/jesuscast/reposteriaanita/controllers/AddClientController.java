package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddClientController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addClientBtn;

    @FXML
    private TextField addressClientInput;

    @FXML
    private Button exitBtn;

    @FXML
    private TextField nameClientInput;

    @FXML
    private ComboBox<String> sexoClientComboBox;

    @FXML
    private TextField timeClientInput;

    @FXML
    void onClickAddClient(MouseEvent event) {
        if (nameClientInput.getText().trim().isEmpty()||
                timeClientInput.getText().trim().isEmpty() ||
                addressClientInput.getText().trim().isEmpty() ||
              sexoClientComboBox.getValue() != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Se requieren datos");
            alert.setContentText("Por favor complete los campos");
            alert.showAndWait();
        }
        else {
            //Somer así se obtiene el valor del combo box
            //Aqui se agregará el cliente
            sexoClientComboBox.getValue();
        }
    }

    @FXML
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        sexoClientComboBox.getItems().addAll("Hombre","Mujer","No binario");
    }

}
