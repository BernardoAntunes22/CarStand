package pt.iade.carStand.controllers;

import daos.UserDAO;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabInfoUserController {
	/**
	 * ListView que far� ser possivel mostrar a lista de clientes
	 */
	@FXML
	private ListView<User> listaClientes_LV;

	/**
	 * Serve para mostrar a lista de clientes atualizada da Base de dados
	 */
	@FXML
	private void initialize() {
		listaClientes_LV.setItems(UserDAO.getUsers());
	}

	/**
	 * Faz logout e volta o login do colab
	 */
	@FXML
	private void backToMainColab() {
		WindowManager.backLoginColab();
	}    

	/**
	 * Serve para voltar ao menu principal do Colab
	 */
	@FXML
	void backToColabInventory() {
		WindowManager.backToColabMainView();
	}
}