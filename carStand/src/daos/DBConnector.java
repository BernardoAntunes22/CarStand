package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnector {
	
	/**
	 * Conexão à base de dados
	 */
	private static final String URL ="jdbc:mysql://remotemysql.com:3306/b01PMoXIWq?useSSL=false";
	private static final String PASS ="peKOLRcmOX";
	private static final String USER ="b01PMoXIWq";

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