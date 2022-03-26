package in.co.rays.Model;

import java.sql.*;
import java.util.ResourceBundle;

import in.co.rays.Bean.LogInBean;

public class LogInModel {
	public void add(LogInBean bean) throws Exception {
		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.Rb.app");

		Class.forName(rs.getString("driver"));

		Connection conn = DriverManager.getConnection(rs.getString("url"), rs.getString("username"),
				rs.getString("password"));

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("INSERT INTO LOGINFORM VALUES(?,?);");

		ps.setString(1, bean.getName());
		ps.setString(2, bean.getPwd());

		int i = ps.executeUpdate();

		System.out.println(i + "added");

		conn.commit();

		conn.close();
		ps.close();

	}

	public void select(LogInBean bean) throws Exception {
		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.Rb.app");

		Class.forName(rs.getString("driver"));

		Connection conn = DriverManager.getConnection(rs.getString("url"), rs.getString("username"),
				rs.getString("password"));

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("select * from loginform where name = ?");

		ps.setString(1, bean.getName());

		ResultSet rs1 = ps.executeQuery();
		System.out.println("\tname" + " " + "\tpass");
		while (rs1.next()) {
			System.out.print("\t" + rs1.getString(1));
			System.out.println("\t" + rs1.getString(2));
		}

		conn.commit();

		conn.close();
		ps.close();
		rs1.close();

	}

	public boolean authenticate(String name, String pwd) throws Exception {

		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Rb.app");

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("select * from loginform where name = ? and password = ?");
		ps.setString(1, name);
		ps.setString(2, pwd);

		ResultSet rs = ps.executeQuery();
		boolean i = rs.next();
		return i;
	}

}
