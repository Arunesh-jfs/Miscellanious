package com.demo.servlet;

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


@WebServlet("/FruitsInsertServlet")
public class FruitsInsertServlet extends HttpServlet {
	
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
		
//		int S_NO=0;
//		
//		if(request.getParameter("S_NO") != null) {
//			S_NO = Integer.parseInt(request.getParameter("S_NO"));
//		} else {
//			System.out.println("Serial Number not entered");
//		}
//		
//		String FRUIT_TYPE=null;
//		
//		if(request.getParameter("FRUIT_TYPE") != null) {
//			FRUIT_TYPE = request.getParameter("S_NO");
//		} else {
//			System.out.println("Fruit Type not entered");
//		}
//		
//		float FRUIT_QUANTITY=0;
//		
//		if(request.getParameter("FRUIT_QUANTITY") != null) {
//			FRUIT_QUANTITY = Float.parseFloat(request.getParameter("FRUIT_QUANTITY"));
//		} else {
//			System.out.println("Fruit Quantity not entered");
//		}
//
//		float FRUIT_PRICE=0 ;
//		
//		if(request.getParameter("FRUIT_PRICE") != null) {
//			FRUIT_PRICE = Float.parseFloat(request.getParameter("FRUIT_PRICE"));
//		} else {
//			System.out.println("Fruit Price not entered");
//		}
//		
//		
//		float TOTAL=0 ;
//		
//		if(request.getParameter("TOTAL") != null) {
//			TOTAL = Float.parseFloat(request.getParameter("TOTAL"));
//		} else {
//			System.out.println("Total not entered");
//		}
//		
		
		int S_NO = Integer.parseInt(request.getParameter("S_NO"));
		String FRUIT_TYPE = request.getParameter("FRUIT_TYPE");
		float FRUIT_QUANTITY = Float.parseFloat(request.getParameter("FRUIT_QUANTITY"));
		float FRUIT_PRICE = Float.parseFloat(request.getParameter("FRUIT_PRICE"));
		float TOTAL = Float.parseFloat(request.getParameter("TOTAL"));
		System.out.println(S_NO+" "+FRUIT_TYPE+" "+FRUIT_QUANTITY+" "+FRUIT_PRICE+" "+TOTAL);
		
		
		
		//CALLING FUNCTION
		insertDetails( S_NO,  FRUIT_TYPE,  FRUIT_QUANTITY,  FRUIT_PRICE,  TOTAL);
		
		//REQUEST DISPATCHER
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("FruitsSelectServlet");
		requestDispatcher.forward(request, response);
	}

	private void insertDetails(int S_NO,String FRUIT_TYPE,float FRUIT_QUANTITY,float FRUIT_PRICE,float TOTAL) {
		
		
		try {
			//CREATE STATEMENT
			Statement statement = connection.createStatement();
			
			//EXECUTE QUERY
			int rowsInserted = statement.executeUpdate("insert into FRUITS values(" + S_NO + ",'" + FRUIT_TYPE + "','" + FRUIT_QUANTITY + "','" + FRUIT_PRICE + "','" + TOTAL + "')");
			if(rowsInserted==1) {
				System.out.println("Numberf rows inserted : " + rowsInserted);
			}else {
				System.out.println("No rows inserted");
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	
	}
	
}
