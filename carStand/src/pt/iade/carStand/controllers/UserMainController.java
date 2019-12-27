package pt.iade.carStand.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import daos.CarDAO;
import daos.DBConnector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.Carlist;
import pt.iade.carStand.models.User;

public class UserMainController {

    @FXML
    private TextField txtID;

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
    void reservar(ActionEvent event) {
    	Car car = listaCarros_LV.getSelectionModel().getSelectedItem();
    	
    	if (!txtID.getText().equals("")) {    		
    		try {
    			Connection conn = DBConnector.getConnection();
				PreparedStatement ps = conn.prepareStatement("DELETE FROM Carro WHERE ID_Car = ?");
				int id = Integer.parseInt(txtID.getText());
				ps.setInt(1, id);
				ps.execute();
				WindowManager.comprarWindow(loggedUser, car);
				
			} catch (SQLException ex) {
				Logger.getLogger(UserMainController.class.getName()).log(Level.SEVERE, null, ex);
			}
    		
    	}else {
    		JOptionPane.showMessageDialog(null, "Introduza um ID válido.");
    	}
    	
    	
    }
}
