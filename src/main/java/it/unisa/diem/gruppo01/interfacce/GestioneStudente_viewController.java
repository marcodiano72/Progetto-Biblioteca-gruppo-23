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

/**
 * FXML Controller class
 *
 * @author Utente
 */
public class GestioneStudente_viewController implements Initializable {

    @FXML
    private Button addSButton;
    @FXML
    private Button modSButton;
    @FXML
    private TextField codeField;
    @FXML
    private TextField codeField1;
    @FXML
    private Button searchSButton;
    @FXML
    private Button deleteSButton;
    @FXML
    private Button exitSButton;
    @FXML
    private Button saveSButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addStudent(ActionEvent event) {
    }

    @FXML
    private void modStudent(ActionEvent event) {
    }

    @FXML
    private void searchStudent(ActionEvent event) {
    }

    @FXML
    private void deleteStudent(ActionEvent event) {
    }

    @FXML
    private void exitS(ActionEvent event) {
    }

    @FXML
    private void saveSFile(ActionEvent event) {
    }
    
}
