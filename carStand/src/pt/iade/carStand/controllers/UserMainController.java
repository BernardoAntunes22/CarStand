package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.Carlist;
import pt.iade.carStand.models.User;

public class UserMainController {
	
    private User loggedUser;
    
    public UserMainController(User loggedUser) {
    	this.loggedUser = loggedUser;
    }
	
    @FXML
    private void backToMain() {
    	WindowManager.backToMainWindow();
    	}

    @FXML
    void comprar(ActionEvent event) {
    	WindowManager.comprarWindow(loggedUser, new Car());
    }

}
