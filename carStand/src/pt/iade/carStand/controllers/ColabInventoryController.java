package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabInventoryController {
    private User loggedUser;    

	public ColabInventoryController(User loggedUser) {
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
