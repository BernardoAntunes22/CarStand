package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabCarPurchasedController {
	private User loggedUser;  
	
	public ColabCarPurchasedController(User loggedUser) {
    	this.loggedUser = loggedUser;
	}
	/**
	 * Serve para voltar ao menu principal do Colab
	 */
	@FXML
	void backToColabInventory() {
		WindowManager.backToColabInventory(loggedUser);
	}
}