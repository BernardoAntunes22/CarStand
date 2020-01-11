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
import pt.iade.carStand.models.User;

public class UserMainController {

	@FXML
	private TextField txtID;

	private User loggedUser;
	
	public UserMainController(User loggedUser) {
		this.loggedUser = loggedUser;
	}
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
		//int nif = loggedUser.getNif(); // nao esta a fazer nada
		listaCarros_LV.setItems(CarDAO.getCarsInventory());
	} 
	
	/**
	 * Serve para fazer o Logout e volta ao Login do User
	 */
	@FXML
	private void backToMain() {
		WindowManager.backLogin();
	}

	/**
	 * Após inserir o ID do carro pretendido o botão fará com que a reserva seja realizada
	 * De modo a que o colaborador depois consiga ver os carros que estão reservados para futuramente finalizar a compra
	 * @param event
	 */
	@FXML
	void reservar(ActionEvent event) {
		Car car = null;

		if (!txtID.getText().equals("")) {
			try {
				Connection conn = DBConnector.getConnection();
				PreparedStatement ps = conn.prepareStatement("UPDATE Carro SET Car_Estado='Reservado', ID_Comprador = ? WHERE ID_Car = ?");
				int id = Integer.parseInt(txtID.getText());
				ps.setInt(2, id);
				ps.setInt(1, loggedUser.getID_Cliente());
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