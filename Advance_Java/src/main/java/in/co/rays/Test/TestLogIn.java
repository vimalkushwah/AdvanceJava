package in.co.rays.Test;

import in.co.rays.Bean.LogInBean;
import in.co.rays.Model.LogInModel;

public class TestLogIn {
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testSelect();
		authenticate();
	}

	private static void authenticate() throws Exception {
		LogInBean bean = new LogInBean();
		bean.setName(null);
		bean.setPwd(null);
		
		LogInBean bean1;
		LogInModel model = new LogInModel();
		bean1 = model.authenticate(bean);
		
		if(bean1 != null) {
			System.out.println("Welcome user");
		}else {
			System.out.println("Invalid user");
		}
		
		
		
	}

	private static void testSelect() throws Exception {
		LogInBean bean = new LogInBean();
		bean.setName("mohit kushwah");
		LogInModel model = new LogInModel();
		model.select(bean);
		
	}

	private static void testAdd() throws Exception {
		
		LogInBean bean = new LogInBean();
		
		bean.setName("rahul rathod");
		bean.setPwd("12345");
		
		LogInModel model = new LogInModel();
		
		model.add(bean);
		
	}

}
