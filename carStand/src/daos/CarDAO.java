package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.carStand.models.Car;

/**
 * @author HP
 *
 */
public final class CarDAO {
	private CarDAO () {}

	/**
	 * Função que mostra ao colaborador a lista de carros atualizados
	 * por ordem de estado == disponivel, reservado ou comprado
	 * @return
	 */
	public static ObservableList<Car> getCars() {
		ObservableList<Car> cars = FXCollections.observableArrayList();

		Connection conn = DBConnector.getConnection();

		try (Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("Select * from Carro ORDER BY Car_Estado")) {
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
	
	/**
	 * Função que faz mostrar apenas os carros disponiveis no Inventário aos clientes
	 * @return
	 */
	public static ObservableList<Car> getCarsInventory() {
		ObservableList<Car> cars = FXCollections.observableArrayList();

		Connection conn = DBConnector.getConnection();

		try (Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("Select * from Carro WHERE Car_Estado = 'Disponível'")) {
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