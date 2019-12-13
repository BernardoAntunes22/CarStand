package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnector {
	private static final String URL ="https://remotemysql.com/phpmyadmin/db_structure.php?server=1&db=b01PMoXIWq";
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
