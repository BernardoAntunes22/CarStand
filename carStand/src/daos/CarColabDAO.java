package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.CarColab;

public final class CarColabDAO {
	private CarColabDAO () {}
	
	public static ObservableList<CarColab> getCarsColab() {
		ObservableList<CarColab> carsColab = FXCollections.observableArrayList();
		
		Connection conn = DBConnector.getConnection();
		
		try (Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("Select * from Carro ORDER BY Estado")) {
			while(rs.next()) {
				String marca = rs.getString("Marca");
				String modelo = rs.getString("Modelo");
				int cilindrada = rs.getInt("Cilindrada");
				double preco = rs.getDouble("Preço");
				int ano = rs.getInt("Ano");
				int ID_Car= rs.getInt("ID_Car");
				String combustivel = rs.getString("Combustivel");
				String estado = rs.getString("Estado");
				
				carsColab.add(new CarColab(ID_Car,marca,modelo,cilindrada,preco,ano,combustivel, estado));
			}			
		} catch(SQLException err) {
			 err.printStackTrace();
		}		
		return carsColab;
	}
}