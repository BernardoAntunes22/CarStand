package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabMainController {	
    private User loggedUser;

	public ColabMainController(User loggedUser) {
    	this.loggedUser = loggedUser;
	}
	
    /**
     * Faz logout e volta o login do colab
     */
    @FXML
    private void backToMainColab() {
    	WindowManager.backLoginColab();
    	}
    
    /**
     * Botão serve para o colab entrar no inventario
     * @param event
     */
    @FXML
    void inventario(ActionEvent event) {
    	WindowManager.inventarioWindow(loggedUser);
    }
    
    /**
     * Botão serve para o colab entrar nas informações de clientes
     * @param event
     */
    @FXML
    void infoUser(ActionEvent event) {
    	WindowManager.infoUserWindow(loggedUser);
    }
    
    /**
     * Botão serve para o colab conseguir adicionar o carro
     * @param event
     */
    @FXML
    void addCar(ActionEvent event) {
    	WindowManager.addCarWindow(loggedUser);
    }

}
