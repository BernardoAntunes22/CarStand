package pt.iade.carStand.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
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


/**
 * Classe com a utilidade de o colaborador conseguir adicionar um carro
 *
 */
public class ColabAddCarController {

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
	
	/**
	 * confirma se todos inputs no preenchimento do carro estao preenchidos
	 * @return
	 */
	public boolean checkInputs(){
		if(txtMarca.getText() == null 
				&& txtModelo.getText() == null 
				&& txtCilindrada.getText() == null
				&& txtAno.getText() == null	
				&& txtPreco.getText() == null
				&& txtCombustivel.getText() == null)
		{		
			return false;
		}
		else {
			try {
				Integer.parseInt(txtPreco.getText());
				return true;
			}catch(Exception ex)
			{
				return false;
			}
		}	
	} 

	/**
	 * Função que serve para adicionar um carro á base de dados 
	 * Se esta correr correr como previsto irá adicionar e mostra uma mensagem de sucesso
	 * Caso não irá mostrar que uma mensagem em como algo está errado 
	 */
	@FXML
	private void openAddCarComplete(ActionEvent evt) {
		if(checkInputs()) {			
			try {
				Connection conn = DBConnector.getConnection();
				PreparedStatement ps = conn.prepareStatement(
						"INSERT INTO Carro(Car_Marca,Car_Modelo,Car_Cilindrada,Car_Preço,Car_Ano,Car_Combustivel)" + "value(?,?,?,?,?,?) "
								, Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, txtMarca.getText());
				ps.setString(2, txtModelo.getText());
				ps.setInt(3, Integer.parseInt(txtCilindrada.getText()));
				ps.setInt(4, Integer.parseInt(txtPreco.getText()));
				ps.setInt(5, Integer.parseInt(txtAno.getText()));
				ps.setString(6, txtCombustivel.getText());
				ps.execute();

				WindowManager.openAddCarComplete();

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
		WindowManager.backToColabMainView();
	}
}