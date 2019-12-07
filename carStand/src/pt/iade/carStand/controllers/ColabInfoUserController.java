package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabInfoUserController {
    private User loggedUser;    

	public ColabInfoUserController(User loggedUser) {
    	this.loggedUser = loggedUser;
	}
	
    @FXML
    private void backToMainColab() {
    	WindowManager.backLoginColab();
    	}
    
    @FXML
    void backToColabMainView() {
    	WindowManager.backToColabMainView(loggedUser);
    }
    
}
