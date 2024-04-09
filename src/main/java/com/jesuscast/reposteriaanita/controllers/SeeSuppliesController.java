package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jesuscast.reposteriaanita.AppReposteria;
import com.jesuscast.reposteriaanita.models.Insumo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SeeSuppliesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn amountSuppliesColumn;

    @FXML
    private AnchorPane container;

    @FXML
    private Button exitBtn;

    @FXML
    private TableColumn idSuppliesColumn;

    @FXML
    private TableColumn nameSuppliesColumn;

    @FXML
    private TableView<Insumo> tableSupplies;

    @FXML
    private Label titleLabel;

    @FXML
    private Label titleLabel1;

    @FXML
    private TableColumn unitSuppliesColumn;
    private ObservableList<Insumo> insumos;

    @FXML
    void onClickExitBtn(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
       insumos= FXCollections.observableArrayList();
        ArrayList<Insumo> listaInsumos;
        listaInsumos = AppReposteria.getReposteria().getListaInsumos();
        this.nameSuppliesColumn.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.amountSuppliesColumn.setCellValueFactory(new PropertyValueFactory("cantidad"));
        this.idSuppliesColumn.setCellValueFactory(new PropertyValueFactory("id"));
        this.unitSuppliesColumn.setCellValueFactory(new PropertyValueFactory("unidadMedida"));
        for (short i = 0; i<listaInsumos.size();i++){
            if (listaInsumos.get(i).isStatus()){
                insumos.add(listaInsumos.get(i));
            }
        }
        tableSupplies.setItems(insumos);
    }

}
