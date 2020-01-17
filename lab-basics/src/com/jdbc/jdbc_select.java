package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_select {
	public static void main(String[] args) {
		
		//Get odbc14.jar
		
		
		try {	
			//Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfuly!");
			
			//Connection to Database
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			System.out.println();
			System.out.println("Connection Established!");
			
			//Query to Backend(SQL/Oracle)
			//Create the Statement
			Statement statement = connection.createStatement();
			
			//Execute the Query
			ResultSet resultSet = statement.executeQuery("Select * from employees");
			while(resultSet.next()) {
				int employeeId = resultSet.getInt("employee_id");
				String firstName = resultSet.getString("first_name");
				System.out.println(employeeId + " > " + firstName);
			}
		} 
		
		catch (ClassNotFoundException e) {
			System.out.println(e);
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}
}
