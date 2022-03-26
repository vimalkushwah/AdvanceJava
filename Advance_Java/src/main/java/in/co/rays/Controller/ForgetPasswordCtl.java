package in.co.rays.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Model.RegistrationModel;

public class ForgetPasswordCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ForgetPasswordCtl() {
		super();
	}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String e = request.getParameter("emailid");

		RegistrationModel u = new RegistrationModel();
		try {
			String pass = u.forgetEmail(e);
			request.setAttribute("pass", pass);
			request.setAttribute("error", "Invalid Email-ID");
			if (pass != null) {
				RequestDispatcher rd = request.getRequestDispatcher("ShowMyPassword.jsp");

				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("ForgotPasswordView.jsp");

				rd.forward(request, response);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		doGet(request, response);
	

	}
	}
