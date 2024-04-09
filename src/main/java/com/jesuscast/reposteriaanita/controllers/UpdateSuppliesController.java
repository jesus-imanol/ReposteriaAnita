package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ArrayList;
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
      if (nameInsumoInput.getText().trim().isEmpty() || idSearchSupplies.getText().trim().isEmpty()){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Error");
          alert.setContentText("Por favor, rellene todos los campos");
          alert.showAndWait();
      }
      else {
          String id = idSearchSupplies.getText();
          String nombre = nameInsumoInput.getText();
          ArrayList<Insumo> insumos;
          insumos=AppReposteria.getReposteria().getListaInsumos();
          boolean encontrado = false;
          int index=0;
          boolean bandera=false;
          while (!bandera && index < insumos.size()) {
              if (insumos.get(index).getId().indexOf(id) >= 0 ) {
                  bandera = true;
                  encontrado=true;
                  AppReposteria.getReposteria().getListaInsumos().get(index).setNombre(nombre);
              }
              index++;
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
              alert.setContentText("Este producto no está dentro de la lista, ingrese uno existente");
              alert.showAndWait();
          }
      }
    }

    @FXML
    void onClickEditUnit(MouseEvent event) {
        if (idSearchSupplies.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Por favor, no deje los campos en blanco");
            alert.showAndWait();
        }
        else {
            if (unitComboBox.getValue() != null) {
                String id = idSearchSupplies.getText();
                String medida = unitComboBox.getValue();
                boolean encontrado = false;
                ArrayList<Insumo> listaInsumos = AppReposteria.getReposteria().getListaInsumos();
                int index=0;
                boolean bandera=false;
                while (!bandera && index < listaInsumos.size()) {
                    if (listaInsumos.get(index).getId().indexOf(id) >= 0 ) {
                        encontrado=true;
                        Insumo insumo = AppReposteria.getReposteria().getListaInsumos().get(index);
                        if (medida.equals("Unidad")) {
                            if (insumo instanceof InsumoPorKiloOLitro) {
                                int cantidad = (int) (((InsumoPorKiloOLitro) insumo).getCantidad());
                                String idRescatada = insumo.getId();
                                String nombre = insumo.getNombre();
                                Insumo insumoTemporal = new InsumosPorUnidad(nombre, medida, cantidad);
                                insumoTemporal.setId(idRescatada);
                                AppReposteria.getReposteria().getListaInsumos().set(index, insumoTemporal);
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("Exito");
                                alert.setContentText("La unidad de medida se ha editado con exito");
                                alert.showAndWait();
                            } else {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("¿?");
                                alert.setContentText("Esta medida ya le pertenece a este insumo...");
                                alert.showAndWait();
                            }
                        } else {
                            if (insumo instanceof InsumosPorUnidad) {
                                double cantidad = ((InsumosPorUnidad) insumo).getCantidad();
                                String nombre = insumo.getNombre();
                                String idRescatada = insumo.getId();
                                Insumo insumoTemporal = new InsumoPorKiloOLitro(nombre, medida, cantidad);
                                insumoTemporal.setId(idRescatada);
                                AppReposteria.getReposteria().getListaInsumos().set(index, insumoTemporal);
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("Exito");
                                alert.setContentText("La unidad de medida se ha editado con exito");
                                alert.showAndWait();
                            } else {
                                if (medida.equals(AppReposteria.getReposteria().getListaInsumos().get(index).getUnidadMedida())) {
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                    alert.setTitle("¿?");
                                    alert.setContentText("Esta medida ya le pertenece a este insumo...");
                                    alert.showAndWait();
                                } else {
                                    AppReposteria.getReposteria().getListaInsumos().get(index).setUnidadMedida(medida);
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                    alert.setTitle("Exito");
                                    alert.setContentText("La unidad de medida se ha editado con exito");
                                    alert.showAndWait();
                                }
                            }
                        }
                    }
                    index++;
                }
                if (!encontrado) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setContentText("No existe ningún insumo con esta ID");
                    alert.showAndWait();
                }
            }
            else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("Por favor ingrese algo en la medida");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void onClickEditUnitExtent(MouseEvent event) {
    if (unitExtentInput.getText().trim().isEmpty() || idSearchSupplies.getText().trim().isEmpty()){
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
        boolean bandera = false;
        int index = 0;
        while (!bandera && index < insumos.size()) {
            if (insumos.get(index).getId().indexOf(id) >= 0 ) {
                bandera = true;
                Insumo insumo= AppReposteria.getReposteria().getListaInsumos().get(index);
                if(insumo instanceof InsumosPorUnidad){
                    try {
                        InsumosPorUnidad insumoTemporal = (InsumosPorUnidad) insumo;
                        int cantidad = Integer.parseInt(unitExtentInput.getText());
                        insumoTemporal.setCantidadPorUnidad(cantidad);
                        insumo = (Insumo) insumoTemporal;
                        AppReposteria.getReposteria().getListaInsumos().set(index, insumo);
                    }
                    catch (Exception e){
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Error");
                        alert.setContentText("Error al guardar datos, ingrese solo valores númericos"+e.getMessage());
                        alert.showAndWait();
                    }
                }
                else if(insumo instanceof InsumoPorKiloOLitro){
                    InsumoPorKiloOLitro insumoTemporal = (InsumoPorKiloOLitro)insumo;
                    double cantidad = Double.parseDouble(unitExtentInput.getText());
                    insumoTemporal.setCantidad(cantidad);
                    insumo=(Insumo)insumoTemporal;
                    AppReposteria.getReposteria().getListaInsumos().set(index,insumo);
                }
                encontrado = true;
            }
            index++;
        }
        if (encontrado){
            Alert alert= new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Éxito");
            alert.setContentText("El insumo se ha editado exitosamente");
            alert.showAndWait();
        }
        else{
            Alert alert= new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Este insumo no está dentro de la lista, ingrese uno existente");
            alert.showAndWait();
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
