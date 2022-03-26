package in.co.rays.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import in.co.rays.Bean.MarkseetBean;
import in.co.rays.Rb.JdbcDataSource;

public class MarksheetModel {
	public void testAdd(MarkseetBean bean) throws Exception {
		/*
		 * ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Rb.app");
		 * 
		 * Class.forName(rb.getString("driver"));
		 * 
		 * Connection conn =
		 * DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.
		 * getString("password"));
		 */Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("insert into Marksheet values(?,?,?,?,?,?,?);");
		
		ps.setInt(1, bean.getId());
		ps.setInt(2, bean.getRollNo());
		ps.setString(3, bean.getfName());
		ps.setString(4, bean.getlName());
		ps.setInt(5, bean.getPhy());
		ps.setInt(6, bean.getChem());
		ps.setInt(7, bean.getMaths());
		int i = ps.executeUpdate();
		
		System.out.println(i+"Added");
		
		conn.commit();
		
		conn.close();
		ps.close();
	}

}
