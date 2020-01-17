package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbselect")
public class DBSelectServlet extends HttpServlet {
	
	Connection connection = null;
	
	@Override
	public void init() throws ServletException {
		System.out.println("INIT ENVOKED");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
		} 
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<h1>Welcome To Servelts</h1>");
		
		//fetchEmployeeDetails(out);
		fetchEmployeeDetailsAsTable(out);
	}

	private void fetchEmployeeDetails(PrintWriter out) {
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employees");
			while(resultSet.next()) {
				int employeeId = resultSet.getInt("employee_id");
				String firstName = resultSet.getString("first_name");
				System.out.println(employeeId + ">>>" + firstName);
				out.println(employeeId + ">>>" + firstName + "<br>");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	private void fetchEmployeeDetailsAsTable(PrintWriter out) throws ClassNotFoundException {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employees");
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<td>Employee ID</td>");
			out.println("<td>First Name</td>");
			out.println("<td>Last Name</td>");
			out.println("<td>Salary</td>");
			out.println("<td>Hire Date</td>");
			out.println("</tr>");
			while(resultSet.next()) {
				out.println("<tr>");
				out.println("<td>"+ resultSet.getInt("employee_id")+"</td>");
				out.println("<td>"+ resultSet.getString("first_name")+"</td>");
				out.println("<td>"+ resultSet.getString("last_name")+"</td>");
				out.println("<td>"+ resultSet.getFloat("salary")+"</td>");
				out.println("<td>"+ resultSet.getDate("HIRE_DATE")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
		
		
	}
}
