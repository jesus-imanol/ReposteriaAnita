package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import com.jesuscast.reposteriaanita.models.Insumo;
import com.jesuscast.reposteriaanita.models.InsumosPorUnidad;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class UpdateSuppliesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ediUnitComboBox;

    @FXML
    private Button editNameBtn;

    @FXML
    private Button editUnitExtentBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private TextField nameInsumoInput;

    @FXML
    private TextField idSearchSupplies;

    @FXML
    private ComboBox<String> unitComboBox;

    @FXML
    private TextField unitExtentInput;

    @FXML
    void onClickEditName(MouseEvent event) {
      if (nameInsumoInput.getText().trim().isEmpty()){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Error");
          alert.setContentText("Por favor ingrese un nombre");
          alert.showAndWait();
      }
      else {
          String id = idSearchSupplies.getText();
          String nombre = nameInsumoInput.getText();
          ArrayList<Insumo> insumos;
          insumos=AppReposteria.getReposteria().getListaInsumos();
          boolean encontrado = false;
          for (short i =0; i<insumos.size(); i++){
              if (insumos.get(i).getId().equals(id)){
                  AppReposteria.getReposteria().getListaInsumos().get(i).setNombre(nombre);
                  encontrado=true;
              }
          }
          if (encontrado){
              Alert alert= new Alert(Alert.AlertType.INFORMATION);
              alert.setTitle("Éxito");
              alert.setContentText("El producto se ha editado exitosamente");
              alert.showAndWait();
          }
          else {
              Alert alert= new Alert(Alert.AlertType.INFORMATION);
              alert.setTitle("Error");
              alert.setContentText("E");
              alert.showAndWait();
          }
      }
    }

    @FXML
    void onClickEditUnit(MouseEvent event) {

    }

    @FXML
    void onClickEditUnitExtent(MouseEvent event) {
    if (unitExtentInput.getText().trim().isEmpty()){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error");
        alert.setContentText("Por favor ingrese una cantidad");
        alert.showAndWait();
    }
    else {
        String id = idSearchSupplies.getText();
        boolean encontrado= false;
        ArrayList<Insumo> insumos;
        insumos = AppReposteria.getReposteria().getListaInsumos();
        for (short i =0; i<insumos.size(); i++){
            if (id.equals(AppReposteria.getReposteria().getListaInsumos().get(i).getId())){
                Insumo insumo= AppReposteria.getReposteria().getListaInsumos().get(i);
                if(insumo instanceof InsumosPorUnidad){
                    InsumosPorUnidad insumoTemporal = (InsumosPorUnidad)insumo;
                    int cantidad = Integer.parseInt(unitExtentInput.getText());
                    insumoTemporal.setCantidadPorUnidad(cantidad);
                    insumo=(Insumo)insumoTemporal;
                    AppReposteria.getReposteria().getListaInsumos().get(i).setInsumo(insumo);
                }
            }
        }
    }
    }

    @FXML
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        unitComboBox.getItems().addAll("Kilo","Unidad","Litro");
    }

}
