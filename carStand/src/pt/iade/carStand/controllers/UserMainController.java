package pt.iade.carStand.controllers;

import daos.CarDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.Carlist;
import pt.iade.carStand.models.User;

public class UserMainController {
	
    private User loggedUser;

    @FXML
    private ListView<Car> listaCarros_LV;
    
    @FXML
    private void initialize() {
    	listaCarros_LV.setItems(CarDAO.getCars());
    } 
    
    public UserMainController(User loggedUser) {
    	this.loggedUser = loggedUser;
    }
	
    @FXML
    private void backToMain() {
    	WindowManager.backLogin();
    	}

    @FXML
    void comprar(ActionEvent event) {
    	WindowManager.comprarWindow(loggedUser, new Car());
    }

}
