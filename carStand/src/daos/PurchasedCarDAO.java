package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carStand.models.CarColab;
import pt.iade.carStand.models.PurchasedCars;

public class PurchasedCarDAO {
	private PurchasedCarDAO () {}
	public static ObservableList<PurchasedCars> getPurchasedCars() {
		ObservableList<PurchasedCars> carsPurchased = FXCollections.observableArrayList();
		
		Connection conn = DBConnector.getConnection();
		
		try (Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("Select * from Carro WHERE Estado = 'Comprado' OR Estado = 'Reservado'")) {
			while(rs.next()) {
				String marca = rs.getString("Marca");
				String modelo = rs.getString("Modelo");
				int cilindrada = rs.getInt("Cilindrada");
				double preco = rs.getDouble("Preço");
				int ano = rs.getInt("Ano");
				int ID_Car= rs.getInt("ID_Car");
				String combustivel = rs.getString("Combustivel");
				String estado = rs.getString("Estado");
				int ID_Comprador = rs.getInt("ID_Comprador");
				
				carsPurchased.add(new PurchasedCars(ID_Car,marca,modelo,cilindrada,preco,ano,combustivel,estado,ID_Comprador));
			}			
		} catch(SQLException err) {
			 err.printStackTrace();
		}		
		return carsPurchased;
	}
}