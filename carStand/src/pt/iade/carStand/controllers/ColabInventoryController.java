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

public class ColabInventoryController {
	
    @FXML
    private TextField txtID;

	
    /**
     * ListView que fará ser possivel mostrar a lista de carros ao colaborador
     */
    @FXML
    private ListView<Car> listaCarrosColab_LV;
	
	/**
	 * Serve para mostrar a lista de carros atualizada da Base de dados
	 */
	@FXML
	private void initialize() {
		listaCarrosColab_LV.setItems(CarDAO.getCars());
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
    private void backToColabMainView() {
    	WindowManager.backToColabMainView();
    }
    @FXML
    void listaCarrosComprados(ActionEvent event) {
    	WindowManager.GoToCarPurchasedWindow();
    }
    /**
     * Serve o colaborador conseguir vender um carro
     * Deste modo o estado do carro passará a Comprado quando aparecer na lista 
     */
    @FXML
    private void PurchasedCarWindow() {

		if (!txtID.getText().equals("")) {
			try {
				Connection conn = DBConnector.getConnection();
				PreparedStatement ps = conn.prepareStatement("UPDATE Carro SET Car_Estado='Comprado' WHERE ID_Car = ?");
				int id = Integer.parseInt(txtID.getText());
				ps.setInt(1, id);
				ps.execute();
				WindowManager.GoToCarPurchasedWindow();

			} catch (SQLException ex) {
				Logger.getLogger(UserMainController.class.getName()).log(Level.SEVERE, null, ex);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Introduza um ID válido.");
		}
	}
}