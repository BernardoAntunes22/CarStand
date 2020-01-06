package pt.iade.carStand.controllers;

import daos.PurchasedCarDAO;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.PurchasedCars;
import pt.iade.carStand.models.User;

public class ColabCarPurchasedController {
	private User loggedUser;  
	
    @FXML
    private ListView<PurchasedCars> listaCarrosCompradosColab_LV;
	
	/**
	 * Serve para mostrar a lista de carros atualizada da Base de dados
	 */
	@FXML
	private void initialize() {
		listaCarrosCompradosColab_LV.setItems(PurchasedCarDAO.getPurchasedCars());
	}
	
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