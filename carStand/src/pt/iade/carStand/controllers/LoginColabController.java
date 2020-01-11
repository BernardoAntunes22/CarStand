package pt.iade.carStand.controllers;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pt.iade.carStand.WindowManager;

public class LoginColabController {
	
    @FXML
    private TextField txtId;

    @FXML
    private PasswordField txtPass;
	
    /**
     * Botão "User" para voltar ao login do User
     */
    @FXML
    private void backToMain() {
    	WindowManager.backLogin();
    	}

    /**
     * Serve para os Colabs fazerem login no site
     * @param event 
     */
    @FXML
    private void entrar(ActionEvent event) {
    	String colab = txtId.getText();
    	String pass = txtPass.getText();
    	
    	if (colab.equals("diogo") && pass.equals("123")
    			|| colab.equals("antunes") && pass.equals("456")
    			|| colab.equals("branco") && pass.equals("789")) {
    		WindowManager.openColabWindow();
    	}else{
    		JOptionPane.showMessageDialog(null, "Id ou Password incorretos");    	
    	}    	
    }
}