<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>

</head>
<body bgcolor="teal">
	<%@ include file="Header.jsp"%>
	<hr>
	<form action="LogInCtlr" method="post">

		<h1 align="center">Login form</h1>
		<%
			String success = (String) request.getAttribute("success");
			if (success != null) {
		%>
		<center>
			<h1>
				<font color="green"><%=success%></font>
			</h1>
		</center>
		<%
			}
		%>

		<%
			String error = (String) request.getAttribute("error");
			if (error != null) {
		%>
		<center>
			<h1>
				<font color="red"><%=error%></font>
			</h1>
		</center>
		<%
			}
		%>


		<table align="center">

			<tr>
				<th>User Name</th>
				<td><input type="text" name="user" placeholder="Enter Username"></td>
				<td>
					<%
						String usererror = (String) request.getAttribute("usererror");
						if (usererror != null) {
					%>
					<center>
						<font color="red"><%=usererror%></font>
					</center> <%
 	}
 %>
				</td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" value="" name="pwd"
					placeholder="Enter Password"></td>
				<!-- pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z].{8,})"
					title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more character" -->

				<td>
					<%
						String pwderror = (String) request.getAttribute("pwderror");
						if (pwderror != null) {
					%>
					<center>
						<font color="red"><%=pwderror%></font>
					</center> <%
 	}
 %>
				</td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Submit"><a
					href="ForgetPassword.jsp">Forget Password</a></td>
			</tr>
			<tr>
				<th></th>
				<td><a href="UserRegistrationView.jsp">Create New Account</a></td>
			</tr>
		</table>

	</form>
	<hr>
	<%@ include file="Footer.jsp"%>

</body>
</html>