package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class UserPaymentCompleteController {

	private User loggedUser;  

	public UserPaymentCompleteController(User loggedUser) {
		this.loggedUser = loggedUser;
	}
	
	/**
	 * Após o pagamento o user pode fazer Logout 
	 */
	@FXML
	private void backToLogin() {
		WindowManager.backLogin();
	}
	
	/**
	 * Volta para a Lista de carros caso o User queira adquirir mais carros
	 */
	@FXML
	private void backToMainView() {
		WindowManager.backToUserMainView(loggedUser);
	}
	
}
