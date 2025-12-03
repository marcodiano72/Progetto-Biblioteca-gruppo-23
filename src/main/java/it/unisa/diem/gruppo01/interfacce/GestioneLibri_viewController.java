/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.gruppo01.interfacce;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Utente
 */
public class GestioneLibri_viewController implements Initializable {

    @FXML
    private Button addLButton;
    @FXML
    private ImageView addButton;
    @FXML
    private Button modLButton;
    @FXML
    private TextField codeField;
    @FXML
    private TextField codeField1;
    @FXML
    private TextField codeField11;
    @FXML
    private Button searchLButton;
    @FXML
    private Button deleteLButton;
    @FXML
    private Button exitLButton;
    @FXML
    private Button saveLButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addLibri(ActionEvent event) {
    }

    @FXML
    private void modLibri(ActionEvent event) {
    }

    @FXML
    private void searchLibri(ActionEvent event) {
    }

    @FXML
    private void deleteLibri(ActionEvent event) {
    }

    @FXML
    private void exitL(ActionEvent event) {
    }

    @FXML
    private void saveLFile(ActionEvent event) {
    }
    
}
