package pt.iade.carStand.controllers;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class LoginUserController {	
	private User loggedUser;
	
    @FXML
    private TextField txtUser;

	/**
	 * Serve para o User fazer login no site
	 * @param event
	 */
	@FXML
    private void entrar(ActionEvent event) {
		loggedUser = new User("", "", 0, 234567897, "", "");
    	String user = txtUser.getText();
    	
    	if (user.equals("igor") || user.equals("benjamin") || user.equals("maci")
    			|| user.equals("lucille") || user.equals("siobhan") || user.equals("mikael")
    			|| user.equals("hamza") || user.equals("rishi") || user.equals("salahuddin")
    			|| user.equals("sapphire") || user.equals("Jareth")) {
    		WindowManager.openItemsWindow(loggedUser);
    	}else{
    		JOptionPane.showMessageDialog(null, "Id inválido, tente novamente.");    	
    	}    	
    } 
	
    /**
     * Botão "Colab" ser para voltar ao login do Colab
     */
    @FXML
    private void openColab() {
    	WindowManager.openColabWindow();
    	}
}
