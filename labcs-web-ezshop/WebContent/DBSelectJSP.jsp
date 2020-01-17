<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			Connection connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//System.out.println("Connection Established!");
			//Create the statement
			Statement statement = connection.createStatement();
			//Execute the query
			ResultSet resultSet = statement
					.executeQuery("select * from employees");
	%>
	<table border='1'>
		<tr>
			<td>Employee Id</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Salary</td>
			<td>Hire Date</td>
		</tr>
		<% while(resultSet.next()) { %>
		<tr>
			<td><%= resultSet.getInt("employee_id")%></td>
			<td><%= resultSet.getString("first_name")%></td>
			<td><%=  resultSet.getString("last_name")%></td>
			<td><%= resultSet.getFloat("salary") %></td>
			<td><%=  resultSet.getDate("HIRE_DATE") %></td>
		</tr>
		<% } %>
	</table>
	<%
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	%>
</body>
</html>