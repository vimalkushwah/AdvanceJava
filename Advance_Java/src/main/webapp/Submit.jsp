<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String Fname=request.getParameter("fname");
String Lname=request.getParameter("lname");
String  Dob=request.getParameter("dob");
String Email=request.getParameter("email");
String Contact=request.getParameter("contact");
String Gender=request.getParameter("gender");
String Add=request.getParameter("add");
String Add1=request.getParameter("add1");
String Add2=request.getParameter("add2");
String Lang=request.getParameter("subject");
%>
<%=Fname%>
<%=Lname%>
<%=Dob%>
<%=Email%>
<%=Contact%>
<%=Gender%>
<%=Add%>
<%=Add1%>
<%=Add2%>
<%=Lang%>

</body>
</html>