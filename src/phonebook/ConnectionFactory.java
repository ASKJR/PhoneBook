package phonebook;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionFactory {
	public Connection getConnection() {
		try {	
			Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/contactDB?autoReconnect=true&useSSL=false", "root", "");
				return con;
		}catch(SQLException e) {
	         throw new RuntimeException(e);
	     }
	}
}
