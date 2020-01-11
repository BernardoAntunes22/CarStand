package pt.iade.carStand.controllers;

import daos.PurchasedCarDAO;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.PurchasedCar;

public class ColabCarPurchasedController {

	/**
	 * ListView criada com a utilidade de mostrar os carros comprados e reservados ao colaborador
	 */
	@FXML
	private ListView<PurchasedCar> listaCarrosCompradosColab_LV;

	/**
	 * Serve para mostrar a lista de carros comprados e reservados atualizada
	 */
	@FXML
	private void initialize() {
		listaCarrosCompradosColab_LV.setItems(PurchasedCarDAO.getPurchasedCars());
	}

	/**
	 * Serve para voltar ao menu principal do Colab
	 */
	@FXML
	void backToColabInventory() {
		WindowManager.backToColabInventory();
	}
}