package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carStand.models.Car;

public final class CarDAO {
	private CarDAO () {}

	/**
	 * Serve para mostrar a lista de carros disponivel no momento ao User
	 * @return
	 */
	public static ObservableList<Car> getCars() {
		ObservableList<Car> cars = FXCollections.observableArrayList();

		Connection conn = DBConnector.getConnection();

		try (Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("Select * from Carro where Car_Estado LIKE 'Disponível'")) {
			while(rs.next()) {
				String marca = rs.getString("Car_Marca");
				String modelo = rs.getString("Car_Modelo");
				int cilindrada = rs.getInt("Car_Cilindrada");
				int preco = rs.getInt("Car_Preço");
				int ano = rs.getInt("Car_Ano");
				int ID_Car= rs.getInt("ID_Car");
				String combustivel = rs.getString("Car_Combustivel");
				String estado = rs.getString("Car_Estado");

				cars.add(new Car(ID_Car, marca,modelo,cilindrada,preco,ano,combustivel,estado));
			}
		} catch(SQLException err) {
			err.printStackTrace();
		}		
		return cars;
	}
}