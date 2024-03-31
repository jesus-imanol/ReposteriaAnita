package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SeePastelesProduct {

    @FXML
    private ResourceBundle resources;
    @FXML
    private AnchorPane container;
    @FXML
    private URL location;
    @FXML
    private Label titleLabel;
    @FXML
    private TableColumn<?, ?> amountPersonProductColumn;

    @FXML
    private TableColumn<?, ?> amountProductColumn;

    @FXML
    private TableColumn<?, ?> designProductColumn;

    @FXML
    private Button exitBtn;

    @FXML
    private TableColumn<?, ?> idProductColumn;

    @FXML
    private TableColumn<?, ?> nameProductColumn;

    @FXML
    private TableColumn<?, ?> priceProductColumn;

    @FXML
    private TableColumn<?, ?> stuffedProductColumn;

    @FXML
    private TableView<?> tableProduct;

    @FXML
    void onClickExitBtn(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        container.getStylesheets().add("com/jesuscast/reposteriaanita/style.css");
    }

}
