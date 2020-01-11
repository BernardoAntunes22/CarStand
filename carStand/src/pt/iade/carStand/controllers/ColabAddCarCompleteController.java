package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;

public class ColabAddCarCompleteController {

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
		WindowManager.backToColabAddCarView();
	}
}