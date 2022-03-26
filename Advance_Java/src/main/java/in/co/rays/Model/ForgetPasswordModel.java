package in.co.rays.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import in.co.rays.Bean.ForgetPasswordBean;

public class ForgetPasswordModel {
	public void getPwd(ForgetPasswordBean bean) throws Exception {
		
        ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Rb.app");
		
	    Class.forName(rb.getString("driver"));
	    
	    Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
	    
	    conn.setAutoCommit(false);
	    
	    PreparedStatement ps = conn.prepareStatement("select * from loginform where password = ?");
	    
	    ps.setString(1, bean.getPwd());
	    
	    ResultSet rs = ps.executeQuery();
	    
	    System.out.println(rs);
	    
	    conn.commit();
	    conn.close();
	    ps.close();
	    rs.close();
	   
	}

}
