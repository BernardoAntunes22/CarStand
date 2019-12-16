package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class LoginColabController {
	private User loggedUser;
	
    /**
     * Botão "USer" ser para voltar ao login do User
     */
    @FXML
    private void backToMain() {
    	WindowManager.backLogin();
    	}

    /**
     * Serve para o Colab fazer login no site
     * @param event 
     */
    @FXML
    void entrar(ActionEvent event) {
    	WindowManager.openColabWindow(loggedUser);
    }

}
