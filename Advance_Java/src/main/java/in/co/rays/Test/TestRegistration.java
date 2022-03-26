package in.co.rays.Test;

import in.co.rays.Bean.RegistrationBean;
import in.co.rays.Model.RegistrationModel;

public class TestRegistration {
	public static void main(String[] args) throws Exception {
		testadd();
	}

	private static void testadd() throws Exception {
		RegistrationBean bean = new RegistrationBean();
		
		bean.setfName("rahul");
		bean.setlName("kumar");
		bean.setDob("11/02/1994");
		bean.setAdd("dhamnod");
		bean.setEmail("rahulkumar23@gmail.com");
		bean.setGender("male");
		bean.setLang("HTML");
		
	RegistrationModel model = new RegistrationModel();
		
	   model.testAdd(bean);
		System.out.println("Success");
		
	}

}
