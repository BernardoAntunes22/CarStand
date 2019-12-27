package pt.iade.carStand.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import daos.DBConnector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.User;

public class ColabAddCarController {
	private User loggedUser;    

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtCilindrada;

    @FXML
    private TextField txtAno;

    @FXML
    private TextField txtPreco;
    
    @FXML
    private TextField txtCombustivel;


	public ColabAddCarController(User loggedUser) {
		this.loggedUser = loggedUser;
	}
	
	// confirma se os inputs estao postos
	public boolean checkInputs(){
		if(txtMarca.getText() == null 
				|| txtModelo.getText() == null 
				|| txtCilindrada.getText() == null
				|| txtAno.getText() == null	
				|| txtPreco.getText() == null)
		{		
			return false;
		}
		else {
			try {
				Double.parseDouble(txtPreco.getText());
				return true;
			}catch(Exception ex)
			{
				return false;
			}
		}	
	} 

	/**
	 * Após adicionar o carro mostra mensagem de sucesso 
	 */
	@FXML
	private void openAddCarComplete(ActionEvent evt) {
		if(checkInputs()) {			
			try {
				Connection conn = DBConnector.getConnection();
					PreparedStatement ps = conn.prepareStatement(
							"INSERT INTO Carro(Marca,Modelo,Cilindrada,Preço,Ano, Combustivel)" + "value(?,?,?,?,?,?) "
									, Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, txtMarca.getText());
				ps.setString(2, txtModelo.getText());
				ps.setInt(3, Integer.parseInt(txtCilindrada.getText()));
				ps.setInt(4, Integer.parseInt(txtPreco.getText()));
				ps.setInt(5, Integer.parseInt(txtAno.getText()));
				ps.setString(6, txtCombustivel.getText());
				ps.execute();
				
				WindowManager.openAddCarComplete(loggedUser);

			}catch(SQLException ex){
				Logger.getLogger(ColabAddCarController.class.getName()).log(Level.SEVERE, null, ex);
			}			
		}else {
			JOptionPane.showMessageDialog(null, "Um ou mais espaços não estão preenchidos.");
		}
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