package in.co.rays.Rb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class JdbcDataSource {
	public static Connection getConnection() throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Rb.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		return conn;
	}

}
