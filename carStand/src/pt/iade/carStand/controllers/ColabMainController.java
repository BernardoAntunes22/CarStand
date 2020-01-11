package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;

public class ColabMainController {	
	
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
    	WindowManager.inventarioWindow();
    }
    
    /**
     * Botão serve para o colab entrar nas informações de clientes
     * @param event
     */
    @FXML
    void infoUser(ActionEvent event) {
    	WindowManager.infoUserWindow();
    }
    
    /**
     * Botão serve para o colab conseguir adicionar o carro
     * @param event
     */
    @FXML
    void addCar(ActionEvent event) {
    	WindowManager.addCarWindow();
    }
}