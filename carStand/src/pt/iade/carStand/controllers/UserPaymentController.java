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

	/**
	 * ap�s introduzir os dados de pagamento aparece um mensagem de sucesso
	 */
	@FXML
	private void paymentComplete() {
		WindowManager.openPaymentComplete(loggedUser);
	}

	/**
	 * Bot�o que faz com que seja possivel cancelar a compra e voltar � lista de carros
	 */
	@FXML
	void backToUserMainView() {
		WindowManager.backToUserMainView(loggedUser);
	}	

}
