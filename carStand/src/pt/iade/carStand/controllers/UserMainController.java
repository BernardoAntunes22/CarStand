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

    /**
     * Id que faz mostrar a lista de carros
     */
    @FXML
    private ListView<Car> listaCarros_LV;
    
    /**
     * Serve para mostrar a lista de carros atualizada da Base de dados
     */
    @FXML
    private void initialize() {
    	int nif = loggedUser.getNif();
    	listaCarros_LV.setItems(CarDAO.getCars());
    } 
    
    public UserMainController(User loggedUser) {
    	this.loggedUser = loggedUser;
    }
	
    /**
     * Serve para fazer o Logout e volta ao Login do User
     */
    @FXML
    private void backToMain() {
    	WindowManager.backLogin();
    	}

    /**
     * Após selecionar o carro o uso do botão serve para prosseguir para o pagamento
     * @param event
     */
    @FXML
    void comprar(ActionEvent event) {
    	Car car = listaCarros_LV.getSelectionModel().getSelectedItem(); 
    	
    	WindowManager.comprarWindow(loggedUser, car);
    }
}
