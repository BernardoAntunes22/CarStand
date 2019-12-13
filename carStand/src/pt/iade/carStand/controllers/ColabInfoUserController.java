package pt.iade.carStand.controllers;

import daos.CarDAO;
import daos.UserDAO;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.User;

public class ColabInfoUserController {
    private User loggedUser;    
    
    @FXML
    private ListView<User> listaClientes_LV;
    
    @FXML
    private void initialize() {
    	listaClientes_LV.setItems(UserDAO.getUsers());
    }

	public ColabInfoUserController(User loggedUser) {
    	this.loggedUser = loggedUser;
	}
	
    @FXML
    private void backToMainColab() {
    	WindowManager.backLoginColab();
    	}
    
    @FXML
    void backToColabMainView() {
    	WindowManager.backToColabMainView(loggedUser);
    }
    
}
