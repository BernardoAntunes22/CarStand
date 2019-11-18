package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.Carlist;
import pt.iade.carStand.models.User;

public class CarStandController {
	
    private User user;
    
    public CarStandController(User user) {
    	this.user = user;
    }
	
    @FXML
    private void backToMain() {
    	WindowManager.backToMainWindow();
    	}

}
