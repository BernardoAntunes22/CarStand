package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class UserPaymentCompleteController {

	private User loggedUser;  

	public UserPaymentCompleteController(User loggedUser) {
		this.loggedUser = loggedUser;
	}
	
	@FXML
	private void backToLogin() {
		WindowManager.backLogin();
	}
	
	@FXML
	private void backToMainView() {
		WindowManager.backToUserMainView(loggedUser);
	}
	
}
