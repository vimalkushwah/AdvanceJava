package in.co.rays.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Bean.LogInBean;
import in.co.rays.Model.LogInModel;

public class LogInCtlr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * String name=request.getParameter("user"); String
		 * pwd=request.getParameter("pwd");
		 * 
		 * Cookie c = new Cookie(name, pwd); c.setMaxAge(24*60*60);
		 * response.setContentType("text/html"); PrintWriter out = response.getWriter();
		 * response.addCookie(c); out.close();
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String name=request.getParameter("user"); String
		  pwd=request.getParameter("pwd");
		  
		  response.setContentType("text/html");
		  
		  PrintWriter out = response.getWriter();
		  
		  out.println(name+" "+pwd); LogInModel model = new LogInModel(); try { boolean
		  i = model.authenticate(name, pwd);
		  
		  if(i == true) { RequestDispatcher rd =
		  request.getRequestDispatcher("/WelcomeCtr");
		  request.setAttribute("usererror", "User id Required"); rd.forward(request,
		  response); }else if(name.equals("")&&(pwd.equals("") )) { RequestDispatcher
		  rd = request.getRequestDispatcher("LogInView.jsp");
		  request.setAttribute("usererror", "User id Required");
		  request.setAttribute("pwderror", "Password Required"); rd.forward(request,
		  response); }else if(name.equals("")) { RequestDispatcher rd =
		  request.getRequestDispatcher("LogInView.jsp");
		  request.setAttribute("usererror", "User id Required"); rd.forward(request,
		  response); }else if(pwd.equals("")) { RequestDispatcher rd =
		  request.getRequestDispatcher("LogInView.jsp");
		  request.setAttribute("pwderror", "Password Required"); rd.forward(request,
		  response); } else { RequestDispatcher rd =
		  request.getRequestDispatcher("LogInView.jsp"); request.setAttribute("error",
		  "Invalid username and pwd !!!!....."); rd.forward(request, response); }
		  }catch(Exception e) { e.printStackTrace(); }
		 
		/*
		 * LogInBean bean = new LogInBean();
		 * 
		 * bean.setName(name); bean.setPwd(pwd);
		 * 
		 * LogInModel model = new LogInModel();
		 * 
		 * try { model.add(bean); } catch (Exception e) { e.printStackTrace(); }
		 * 
		 */
		/*
		 * LogInBean bean = new LogInBean(); bean.setName(name); LogInModel model = new
		 * LogInModel(); try { model.select(bean); } catch (Exception e) {
		 * e.printStackTrace(); } 
		 */
		//out.close();
		doGet(request, response);
	}

}
