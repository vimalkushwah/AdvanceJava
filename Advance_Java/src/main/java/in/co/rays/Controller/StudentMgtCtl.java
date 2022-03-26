package in.co.rays.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Bean.StudentBean;
import in.co.rays.Model.StudentModel;

public class StudentMgtCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean bean = new StudentBean();
		bean.setRollNO(request.getParameter("rollNo"));
		bean.setFirstName(request.getParameter("fname"));
		bean.setLastName(request.getParameter("lname"));
		bean.setSession(request.getParameter("session"));
		
		response.setContentType("text/html");
		
		
		String op = request.getParameter("operation");
		
		if(op.equals("Add")) {
			try {
				StudentModel.add(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(op.equals("Modify")) {
			try {
				StudentModel.update(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(op.equals("Delete")) {
			String rollNo = null;
			try {
				StudentModel.delete(rollNo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			
		}
		
		doGet(request, response);
	}

}
