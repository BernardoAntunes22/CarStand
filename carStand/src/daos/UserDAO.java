package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.User;

public final class UserDAO {
	private UserDAO () {}
	
	public static ObservableList<User> getUsers() {
		ObservableList<User> users = FXCollections.observableArrayList();
		
		Connection conn = DBConnector.getConnection();
		
		try (Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("Select * from Cliente")) {
			while(rs.next()) {
				//O ID não irá ser usado
				String nome = rs.getString("Nome");
				String morada = rs.getString("Morada");
				int telemovel = rs.getInt("NTelemóvel");
				int nif = rs.getInt("NIF");
				String email = rs.getString("Email");
				String profissao = rs.getString("Profissão");
				
				users.add(new User(nome,morada,telemovel,nif,email,profissao));
			}
			
		} catch(SQLException err) {
			 err.printStackTrace();
		}
		
		return users;
	}

}
