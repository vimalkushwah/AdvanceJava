<%@ page errorPage="ExceptionHandler.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int age;
age = Integer.parseInt(request.getParameter("age")); %>
<p>
Your age is:<%=age %>year.
</p>
</body>
</html>