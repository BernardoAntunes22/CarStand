package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carStand.models.CarColab;

public final class CarColabDAO {
	private CarColabDAO () {}
	
	/**
	 * Serve para mostrar a lista de carros atualizada no invent�rio do colaborador
	 * @return
	 */
	public static ObservableList<CarColab> getCarsColab() {
		ObservableList<CarColab> carsColab = FXCollections.observableArrayList();
		
		Connection conn = DBConnector.getConnection();
		
		try (Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("Select * from Carro ORDER BY Car_Estado")) {
			while(rs.next()) {
				String marca = rs.getString("Car_Marca");
				String modelo = rs.getString("Car_Modelo");
				int cilindrada = rs.getInt("Car_Cilindrada");
				double preco = rs.getDouble("Car_Pre�o");
				int ano = rs.getInt("Car_Ano");
				int ID_Car= rs.getInt("ID_Car");
				String combustivel = rs.getString("Car_Combustivel");
				String estado = rs.getString("Car_Estado");
				
				carsColab.add(new CarColab(ID_Car,marca,modelo,cilindrada,preco,ano,combustivel,estado));
			}			
		} catch(SQLException err) {
			 err.printStackTrace();
		}		
		return carsColab;
	}
}