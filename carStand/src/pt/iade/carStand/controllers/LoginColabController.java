package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class LoginColabController {
	private User loggedUser;
	
    @FXML
    private void backToMain() {
    	WindowManager.backLogin();
    	}

    @FXML
    void entrar(ActionEvent event) {
    	WindowManager.openColabWindow(loggedUser);
    }

}
