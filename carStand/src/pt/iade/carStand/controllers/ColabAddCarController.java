package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabAddCarController {
    private User loggedUser;    

	public ColabAddCarController(User loggedUser) {
    	this.loggedUser = loggedUser;
	}
	
	@FXML
	private void openAddCarComplete() {
		WindowManager.openAddCarComplete(loggedUser);
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
