package in.co.rays.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Bean.MarkseetBean;
import in.co.rays.Model.MarksheetModel;

public class MarksheetCtr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MarkseetBean bean = new MarkseetBean();
		bean.setId(Integer.parseInt(request.getParameter("id")));
		bean.setRollNo(Integer.parseInt(request.getParameter("rollno")));
		bean.setfName(request.getParameter("fname"));
		bean.setlName(request.getParameter("lname"));
		bean.setPhy(Integer.parseInt(request.getParameter("phy")));
		bean.setChem(Integer.parseInt(request.getParameter("chem")));
		bean.setMaths(Integer.parseInt(request.getParameter("maths")));
		
		response.setContentType("text/html");

        MarksheetModel model = new MarksheetModel();
		try {
			model.testAdd(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}

		doGet(request, response);
	}

	}


