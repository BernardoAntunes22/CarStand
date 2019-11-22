package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class LoginController {
	@FXML
    private void entrar(ActionEvent event) {
    	WindowManager.openItemsWindow(new User());
    }  

}
