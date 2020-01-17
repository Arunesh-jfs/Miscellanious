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


@WebServlet("/FruitsSelectServlet")
public class FruitsSelectServlet extends HttpServlet {
	
	Connection connection = null;
	
	//INIT FUNCTION
	@Override
	public void init() throws ServletException {
		System.out.println("INIT ENVOKED!");
		try {			
			//LOAD THE DRIVER
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//CONNECTION TO DATABASE
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SERVICE INVOKED");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to GROFFERS</h1>");
		
		//CALLING FUNCTIONS
		fetchFruitDetails(out);
	}

	private void fetchFruitDetails(PrintWriter out) {
		try {
			//CREATE STATEMENT
			Statement statement = connection.createStatement();
			
			//EXECUTE QUERY
			ResultSet resultSet = statement.executeQuery("Select * from FRUITS");
				
			//CREATING TABLE
			out.println("<table border='1'><tr>");
			out.println("<td>S_NO</td>");
			out.println("<td>FRUIT_TYPE</td>");
			out.println("<td>FRUIT_QUANTITY</td>");
			out.println("<td>FRUIT_PRICE</td>");
			out.println("<td>TOTAL</td>");
			out.println("</tr>");
			
			while(resultSet.next()) {

				out.println("<tr>");
				out.println("<td>" + resultSet.getInt("S_NO") + "</td>");
				out.println("<td>" + resultSet.getString("FRUIT_TYPE") + "</td>");
				out.println("<td>" + resultSet.getFloat("FRUIT_QUANTITY") + "</td>");
				out.println("<td>" + resultSet.getFloat("FRUIT_PRICE") + "</td>");
				out.println("<td>" + resultSet.getFloat("TOTAL") + "</td>");
				out.println("</tr>");	
			}
			
			out.println("</table>");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
}
