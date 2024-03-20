package com.jesuscast.reposteriaanita.controllers;

import java.net.URL;
import java.util.ResourceBundle;

<<<<<<< HEAD
import com.jesuscast.reposteriaanita.AppReposteria;
=======
import com.jesuscast.reposteriaanita.Reposteria;
>>>>>>> origin/master
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class SeeProductsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> amountProductColumn;

    @FXML
    private TableColumn<?, ?> idProductColumn;

    @FXML
    private TableColumn<?, ?> nameProductColumn;

    @FXML
    private TableColumn<?, ?> priceProductColumn;

    @FXML
    private TableView<?> tableProductColumn;

    @FXML
    private TableColumn<?, ?> typeProductColumn;

    @FXML
    void onClickExitSee(MouseEvent event) {
<<<<<<< HEAD
        AppReposteria.getStageView().close();
=======
        Reposteria.getStageView().close();
>>>>>>> origin/master
    }

    @FXML
    void initialize() {

    }

}
