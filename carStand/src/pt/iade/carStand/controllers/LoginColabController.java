package pt.iade.carStand.controllers;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class LoginColabController {
	private User loggedUser;
	
    @FXML
    private TextField txtId;

    @FXML
    private PasswordField txtPass;
	
    /**
     * Botão "USer" ser para voltar ao login do User
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
    void entrar(ActionEvent event) {
    	String id = txtId.getText();
    	String pass = txtPass.getText();
    	
    	if (id.equals("diogo") && pass.equals("123")
    			|| id.equals("antunes") && pass.equals("456")
    			|| id.equals("branco") && pass.equals("789")) {
    		WindowManager.openColabWindow(loggedUser);
    	}else{
    		JOptionPane.showMessageDialog(null, "Id ou Password incorretos");    	
    	}    	
    }
}
