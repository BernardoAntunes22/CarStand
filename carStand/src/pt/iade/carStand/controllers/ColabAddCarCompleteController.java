package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabAddCarCompleteController {
	private User loggedUser;   

	public ColabAddCarCompleteController(User loggedUser) {
		this.loggedUser = loggedUser;		
	}

	/**
	 * Faz logout e volta o login do colab
	 */
	@FXML
	private void backToColabLogin() {
		WindowManager.backLoginColab();
	}

	/**
	 * Serve para o colab poder adicionar mais um carro 
	 */
	@FXML
	private void backToAddCar() {
		WindowManager.backToColabAddCarView(loggedUser);
	}
}
