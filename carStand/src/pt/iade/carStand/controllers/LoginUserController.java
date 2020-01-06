package pt.iade.carStand.controllers;

import javax.swing.JOptionPane;

import daos.UserDAO;
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
		String userName = txtUser.getText();
		loggedUser = UserDAO.getUserByName(userName);
	    
    	if ( loggedUser != null)
    	{
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