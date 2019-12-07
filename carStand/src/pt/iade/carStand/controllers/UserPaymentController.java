package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.User;

public class UserPaymentController {
	
    private User loggedUser;    

	public UserPaymentController(User loggedUser, Car carToBuy) {
    	this.loggedUser = loggedUser;
	}

    @FXML
    private void backToMain() {
    	WindowManager.backLogin();
    	}
    
    @FXML
    void backToUserMainView() {
    	WindowManager.backToUserMainView(loggedUser);

    }	

}
