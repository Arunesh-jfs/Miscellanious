package com.demo.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbinsert")
public class DBInsertServlet extends HttpServlet {
	
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
		int bookId = Integer.parseInt(req.getParameter("bookId"));
		String bookName = req.getParameter("bookName");
		
		insertDetails(bookId,bookName);	
	}

	private void insertDetails(int bookId, String bookName) {
		try {
			Statement statement = connection.createStatement();
			int noOfRowsInserted = statement.executeUpdate("insert into Books values( " + bookId + ", '" + bookName + "' )" );
			if(noOfRowsInserted ==1) {
				System.out.println("NO OF ROWS INSERTED : " + noOfRowsInserted);
			}
			else {
				System.out.println("No rows inserted!");
}
		} catch (SQLException e) {
			System.out.println(e);
		}
	
	
	}
}

