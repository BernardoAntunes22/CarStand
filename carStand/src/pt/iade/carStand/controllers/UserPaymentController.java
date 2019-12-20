package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.User;

public class UserPaymentController {

	private User loggedUser;    
	private Car carToBuy;

	public UserPaymentController(User loggedUser, Car carToBuy) {
		this.loggedUser = loggedUser;
		this.carToBuy = carToBuy;
	}

	/**
	 * após introduzir os dados de pagamento aparece um mensagem de sucesso
	 */
	@FXML
	private void paymentComplete() {
		
		// chamar dao com id de user e de carro
		WindowManager.openPaymentComplete(loggedUser);
	}

	/**
	 * Botão que faz com que seja possivel cancelar a compra e voltar á lista de carros
	 */
	@FXML
	void backToUserMainView() {
		WindowManager.backToUserMainView(loggedUser);
	}	
}
