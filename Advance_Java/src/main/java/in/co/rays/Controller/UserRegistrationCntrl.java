package in.co.rays.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Bean.RegistrationBean;
import in.co.rays.Model.RegistrationModel;

@WebServlet(urlPatterns = "/HelloName")
public class UserRegistrationCntrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("LogInView.jsp");
		String Fname = request.getParameter("fname");
		String Lname = request.getParameter("lname");
		String Dob = request.getParameter("dob");
		String Email = request.getParameter("email");
		String Contact = request.getParameter("quantity");
		String Gender = request.getParameter("gender");
		String Add = request.getParameter("add");
		String Lang = request.getParameter("subject");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println(
				Fname + " " + Lname + " " + Dob + " " + Email + " " + Contact + " " + Gender + " " + Add + " " + Lang);
		/*
		 * RegistrationModel model = new RegistrationModel(); try { boolean i =
		 * model.authenticate(Email, Dob);
		 * 
		 * if (i == true) { RequestDispatcher rd =
		 * request.getRequestDispatcher("LogInView.jsp");
		 * request.setAttribute("success", "Login Successful"); rd.forward(request,
		 * response); }else if(Fname.equals("")&&(Lname.equals("") )) {
		 * RequestDispatcher rd =
		 * request.getRequestDispatcher("UserRegistratioView.jsp");
		 * request.setAttribute("frerror", "Fname Required");
		 * request.setAttribute("lerror", "Lname Required"); rd.forward(request,
		 * response); } else { RequestDispatcher rd =
		 * request.getRequestDispatcher("UserRegistrationView.jsp");
		 * request.setAttribute("error1", "Invalid Details !!!!.....");
		 * rd.forward(request, response); } } catch (Exception e) { e.printStackTrace();
		 * }
		 */		/*
		 * if (Fname.equals("vimal") && Lname.equals("kushwah") &&
		 * Dob.equals("16/03/2022") && Email.equals("kushwahvimal28@gmail.com") &&
		 * Contact.equals("7974044637") && Gender.equals("Male") &&
		 * Add.equals("semalda")&&Lang.equals("HTML")) { RequestDispatcher rd =
		 * request.getRequestDispatcher("LogInView.jsp");
		 * request.setAttribute("Success", "Login Succesfully"); rd.forward(request,
		 * response); } else { RequestDispatcher rd =
		 * request.getRequestDispatcher("UserRegistrationView.jsp");
		 * request.setAttribute("error1", "Invalid user Detail"); rd.forward(request,
		 * response);
		 * 
		 * }
		 */
		
		  RegistrationBean bean = new RegistrationBean();
		  
		  bean.setfName(Fname); bean.setlName(Lname); bean.setDob(Dob);
		  bean.setAdd(Add); bean.setEmail(Email); bean.setGender(Gender);
		  bean.setLang(Lang);
		  
		  RegistrationModel model = new RegistrationModel();
		  
		  try { model.testAdd(bean); } catch (Exception e) { e.printStackTrace(); }
		  
		 
		out.close();

		doGet(request, response);
	}

}
