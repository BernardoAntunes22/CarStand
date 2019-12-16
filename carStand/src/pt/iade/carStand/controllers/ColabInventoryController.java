package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabInventoryController {
    private User loggedUser;    

	public ColabInventoryController(User loggedUser) {
    	this.loggedUser = loggedUser;
	}
	
    /**
     * Faz logout e volta o login do colab
     */
    @FXML
    private void backToMainColab() {
    	WindowManager.backLoginColab();
    	}
    
    /**
     * Serve para voltar ao menu principal do Colab
     */
    @FXML
    void backToColabMainView() {
    	WindowManager.backToColabMainView(loggedUser);
    }

}
