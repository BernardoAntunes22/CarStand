package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnector {
	
	/**
	 * Conexão à base de dados
	 */
	private static final String URL ="jdbc:mysql://remotemysql.com:3306/woNz7Lrwfr?useSSL=false";
	private static final String PASS ="SmzVaWXIdl";
	private static final String USER ="woNz7Lrwfr";

	private static Connection connector;
	private DBConnector () {
	}

	public static Connection getConnection() {
		try {
			if (connector == null || connector.isClosed())
				connector = DriverManager.getConnection(URL,USER,PASS);
			return connector;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}