<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%-- <jsp:forward page ="B.jsp"/>  --%>
 <%-- <% response.sendRedirect("B.jsp");%> --%> 
<%
request.setAttribute("mithai", "gulabjamun");
%>
<jsp:forward page ="B.jsp"/> 
</body>
</html>