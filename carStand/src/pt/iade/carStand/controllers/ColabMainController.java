package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabMainController {	
    private User loggedUser;

	public ColabMainController(User loggedUser) {
    	this.loggedUser = loggedUser;
	}
	
    @FXML
    private void backToMainColab() {
    	WindowManager.backLoginColab();
    	}
    
    @FXML
    void inventario(ActionEvent event) {
    	WindowManager.inventarioWindow(loggedUser);
    }
    
    @FXML
    void infoUser(ActionEvent event) {
    	WindowManager.infoUserWindow(loggedUser);
    }
    
    @FXML
    void addCar(ActionEvent event) {
    	WindowManager.addCarWindow(loggedUser);
    }

}
