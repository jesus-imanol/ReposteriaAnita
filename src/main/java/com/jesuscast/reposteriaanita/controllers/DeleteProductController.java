package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import com.jesuscast.reposteriaanita.models.Reposteria;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
    private TextField nameProductDeleteImage;

    @FXML
    void onClickDeleteProduct(MouseEvent event) {

    }

    @FXML
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickNameProductDeleteImage(MouseEvent event) {
        if (nameProductDeleteImage.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Por favor ingrese una ID");
            alert.showAndWait();
        } else {
            String id = nameProductDeleteImage.getText();
           if (AppReposteria.getReposteria().eliminarProducto(id)){
               Alert alert=new Alert(Alert.AlertType.INFORMATION);
               alert.setTitle("Éxito");
               alert.setContentText("Producto eliminado con éxito");
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