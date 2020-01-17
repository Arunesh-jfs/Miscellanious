package com.web.test3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test3")
public class test3 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String fname = request.getParameter("fname");
		 String lname = request.getParameter("lname");
		 String eMail = request.getParameter("eMail");
		 String password = request.getParameter("password");
		 String country = request.getParameter("country");
		 
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			Statement statement = connection.createStatement();
			String queryString = "insert into DETAILS values('" + fname + "', '" + lname + "', '" + eMail + "', '" + password + "', '" + country + "')";
			System.out.println(queryString);
			int noOfRowsInserted = statement.executeUpdate(queryString);
			if(noOfRowsInserted ==1) {
				System.out.println("NO OF ROWS INSERTED : " + noOfRowsInserted);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.html");
				requestDispatcher.forward(request, response);
			}
			else {
				System.out.println("No rows inserted!");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("Error.html");
				requestDispatcher.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		 
		 
	}
	
	
}
