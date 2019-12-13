package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class LoginUserController {
	
	private User loggedUser;
	@FXML
    private void entrar(ActionEvent event) {
    	WindowManager.openItemsWindow(loggedUser);
    }  
	
    @FXML
    private void openColab() {
    	WindowManager.openColabWindow();
    	} 
	

}
