package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import com.jesuscast.reposteriaanita.models.Insumo;
import com.jesuscast.reposteriaanita.models.InsumoPorKiloOLitro;
import com.jesuscast.reposteriaanita.models.InsumosPorUnidad;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddSuppliesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addSuppliesBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private TextField nameInsumoInput;

    @FXML
    private ComboBox<String> unitComboBox;

    @FXML
    private TextField amountInput;

    @FXML
    void onClickAddSupplies(MouseEvent event) {
        if (nameInsumoInput.getText().trim().isEmpty()||
                amountInput.getText().trim().isEmpty()||
                unitComboBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Se requieren datos");
            alert.setContentText("Por favor complete los campos");
            alert.showAndWait();
        }
        else {
            String nombre = nameInsumoInput.getText();
            String unidadMedida=unitComboBox.getValue();
            try {
                switch (unidadMedida){
                    case "Kilo":
                    case "Litro":
                       double cantidad=Double.parseDouble(amountInput.getText());
                       if (cantidad>=0) {
                           Insumo insumo = new InsumoPorKiloOLitro(nombre, unidadMedida, cantidad);
                           if (AppReposteria.getReposteria().addInsumo(insumo)) {
                               Alert alert = new Alert(Alert.AlertType.INFORMATION);
                               alert.setTitle("Exito");
                               alert.setContentText("Guardado exitosamente");
                               alert.showAndWait();
                           } else {
                               Alert alert = new Alert(Alert.AlertType.INFORMATION);
                               alert.setTitle("Error");
                               alert.setContentText("Ha habido un error al guardar, intente de nuevo, por favor");
                               alert.showAndWait();
                           }
                       }else {
                           Alert alert = new Alert(Alert.AlertType.INFORMATION);
                           alert.setTitle("Error");
                           alert.setContentText("No puede ingresar cantidades negativas");
                           alert.showAndWait();
                       }
                        break;
                    case "Unidad":
                        int cantidadUnidad = Integer.parseInt(amountInput.getText());
                        if (cantidadUnidad>=0) {
                            Insumo insumoUnidad = new InsumosPorUnidad(nombre, unidadMedida, cantidadUnidad);
                            if (AppReposteria.getReposteria().addInsumo(insumoUnidad)) {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("Exito");
                                alert.setContentText("Guardado exitosamente");
                                alert.showAndWait();
                            } else {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("Error");
                                alert.setContentText("Ha habido un error al guardar, intente de nuevo, por favor");
                                alert.showAndWait();
                            }
                        }else {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Error");
                            alert.setContentText("No puede ingresar cantidades negativas");
                            alert.showAndWait();
                        }
                }
            }
            catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("Error al guardar datos, ingrese solo valores númericos"+e.getMessage());
                alert.showAndWait();
            }
            //Aqui se agregara
        }
    }

    @FXML
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        AppReposteria.addValidator(amountInput);
        AppReposteria.addValidator(nameInsumoInput);
        unitComboBox.getItems().addAll("Kilo","Unidad","Litro");
    }

}
