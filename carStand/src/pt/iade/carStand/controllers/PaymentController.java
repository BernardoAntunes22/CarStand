package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.User;

public class PaymentController {
	
    private User loggedUser;    

	public PaymentController(User loggedUser, Car carToBuy) {
    	this.loggedUser = loggedUser;
	}

    @FXML
    private void backToMain() {
    	WindowManager.backToMainWindow();
    	}
    
    @FXML
    void backToUserMainView() {
    	WindowManager.backToUserMainView(loggedUser);

    }

	

}
