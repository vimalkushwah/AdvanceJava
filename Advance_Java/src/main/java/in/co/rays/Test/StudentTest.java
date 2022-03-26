package in.co.rays.Test;

import in.co.rays.Bean.StudentBean;
import in.co.rays.Model.StudentModel;

public class StudentTest {
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		testDelete("102");
	}


	private static void testDelete(String i) throws Exception {
	StudentModel.delete(i);
	}


	private static void testUpdate() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setRollNO("102");
		bean.setFirstName("ranu");
		bean.setLastName("Thakre");
		bean.setSession("2019-20");
		StudentModel.update(bean);
	}

	private static void testAdd() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setRollNO("101");
		bean.setFirstName("Ram");
		bean.setLastName("Sharma");
		bean.setSession("2020-21");
		StudentModel.add(bean);
	}
	}
