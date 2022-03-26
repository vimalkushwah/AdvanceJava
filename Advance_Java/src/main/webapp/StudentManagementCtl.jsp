<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="in.co.rays.Bean.StudentBean" %>
<%@page import="in.co.rays.Model.StudentModel" %>
<%StudentBean bean = new StudentBean();
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

%>

</body>
</html>