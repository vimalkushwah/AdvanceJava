package in.co.rays.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import in.co.rays.Bean.RegistrationBean;

public class RegistrationModel {
	public void testAdd(RegistrationBean bean) throws Exception {

		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Rb.app");

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("INSERT INTO REGISTRATION VALUES(?,?,?,?,?,?,?);");

		ps.setString(1, bean.getfName());
		ps.setString(2, bean.getlName());
		ps.setString(3, bean.getDob());
		ps.setString(4, bean.getEmail());
		ps.setString(5, bean.getGender());
		ps.setString(6, bean.getAdd());
		ps.setString(7, bean.getLang());

		int i = ps.executeUpdate();

		System.out.println(i + "added");

		conn.commit();

		conn.close();
		ps.close();

	}
public boolean authenticate(String Email,String dob) throws Exception{
        
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Rb.app");
		
	    Class.forName(rb.getString("driver"));
	    
	    Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
	    
	    conn.setAutoCommit(false);
	    
	    PreparedStatement ps = conn.prepareStatement("select * from registration where Email=? and dob=?");
	    ps.setString(1, Email);
	    ps.setString(2, dob);
	    ResultSet  rs = ps.executeQuery();
    boolean i = rs.next();
	return i  ;
}
public String forgetEmail(String e) {
	// TODO Auto-generated method stub
	return null;
}
}
