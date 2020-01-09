package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carStand.models.PurchasedCar;

public class PurchasedCarDAO {
	private PurchasedCarDAO () {}
	/**
	 * serve para mostrar a lista de carros reservados/comprados
	 * @return
	 */
	public static ObservableList<PurchasedCar> getPurchasedCars() {
		ObservableList<PurchasedCar> carsPurchased = FXCollections.observableArrayList();
		
		Connection conn = DBConnector.getConnection();
		
		try (Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("Select * from Carro LEFT JOIN Cliente ON ID_Comprador = ID_Cliente "
						+ "WHERE Car_Estado = 'Comprado' OR Car_Estado = 'Reservado' ORDER BY Car_Estado")) {
			while(rs.next()) {
				String marca = rs.getString("Car_Marca");
				String modelo = rs.getString("Car_Modelo");
				int cilindrada = rs.getInt("Car_Cilindrada");
				double preco = rs.getDouble("Car_Preço");
				int ano = rs.getInt("Car_Ano");
				int ID_Car= rs.getInt("ID_Car");
				String combustivel = rs.getString("Car_Combustivel");
				String estado = rs.getString("Car_Estado");
				int ID_Comprador = rs.getInt("ID_Comprador");
				String nome = rs.getString("CL_Nome");
				
				carsPurchased.add(new PurchasedCar(ID_Car,marca,modelo,cilindrada,preco,ano,combustivel,estado,ID_Comprador,nome));
			}			
		} catch(SQLException err) {
			 err.printStackTrace();
		}		
		return carsPurchased;
	}
}