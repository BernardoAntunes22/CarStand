package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
				int id = rs.getInt("ID_Cliente");
				String nome = rs.getString("CL_Nome");
				String morada = rs.getString("CL_Morada");
				int telemovel = rs.getInt("CL_NTelemóvel");
				int nif = rs.getInt("CL_NIF");
				String email = rs.getString("CL_Email");
				String profissao = rs.getString("CL_Profissão");

				users.add(new User(id, nome,morada,telemovel,nif,email,profissao));
			}			
		} catch(SQLException err) {
			err.printStackTrace();
		}		
		return users;
	}

	public static User getUserByName(String nome) {

		Connection conn = DBConnector.getConnection();

		try (PreparedStatement ps = conn.prepareStatement("Select * from Cliente WHERE CL_Nome LIKE ?")) {
			ps.setString(1, nome);
			try (ResultSet rs = ps.executeQuery()) {
				if(rs.next()) {
					int id =  rs.getInt("ID_Cliente");
					String morada = rs.getString("CL_Morada");
					int telemovel = rs.getInt("CL_NTelemóvel");
					int nif = rs.getInt("CL_NIF");
					String email = rs.getString("CL_Email");
					String profissao = rs.getString("CL_Profissão");

					return new User(id, nome,morada,telemovel,nif,email,profissao);
				} else {
					return null;
				}
			}			
		} catch(SQLException err) {
			err.printStackTrace();
		}		
		return null;
	}
}