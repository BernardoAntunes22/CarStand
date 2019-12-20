package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carStand.models.Car;

public final class  CarDAO {
	private CarDAO () {}
	
	public static ObservableList<Car> getCars() {
		ObservableList<Car> cars = FXCollections.observableArrayList();
		
		Connection conn = DBConnector.getConnection();
		
		try (Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("Select * from Carro")) {
			while(rs.next()) {
				//O ID não irá ser usado
				String marca = rs.getString("Marca");
				String modelo = rs.getString("Modelo");
				int cilindrada = rs.getInt("Cilindrada");
				double preco = rs.getDouble("Preço");
				int ano = rs.getInt("Ano");
				int ID_Car= rs.getInt("ID_Car");
				cars.add(new Car(ID_Car, marca,modelo,cilindrada,preco,ano));
			}
			
		} catch(SQLException err) {
			 err.printStackTrace();
		}
		
		return cars;
	}

}
