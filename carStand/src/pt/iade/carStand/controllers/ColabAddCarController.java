package pt.iade.carStand.controllers;

import javafx.fxml.FXML;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabAddCarController {
    private User loggedUser;    

	public ColabAddCarController(User loggedUser) {
    	this.loggedUser = loggedUser;
	}
	
	/**
	 * Após adicionar o carro mostra mensagem de sucesso 
	 */
	@FXML
	private void openAddCarComplete() {
		WindowManager.openAddCarComplete(loggedUser);
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
    void backToColabMainView() {
    	WindowManager.backToColabMainView(loggedUser);
    }
    
}
