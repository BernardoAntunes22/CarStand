package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class LoginUserController {
	
	private User loggedUser;
	
	/**
	 * Serve para o User fazer login no site
	 * @param event
	 */
	@FXML
    private void entrar(ActionEvent event) {
		loggedUser = new User("", "", 0, 234567897, "", "");
    	WindowManager.openItemsWindow(loggedUser);
    }  
	
    /**
     * Bot�o "Colab" ser para voltar ao login do Colab
     */
    @FXML
    private void openColab() {
    	WindowManager.openColabWindow();
    	} 
}
