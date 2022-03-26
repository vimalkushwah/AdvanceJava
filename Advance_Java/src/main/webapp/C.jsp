<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Java</b>
 <%
request.setAttribute("sabji", "matar");
%>
 
 <%
String m = (String)request.getAttribute("mithai");
String c = (String)request.getAttribute("colddrink");
String s = (String)request.getAttribute("sabji");
%>
<%=m%>
<%=c%>
<%=s%>

</body>
</html>