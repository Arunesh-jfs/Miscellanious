package com.exceptionHandeling;

public class ExceptoinHandling {
	
	public static void main(String[] args) {
		int i = 100;
		int result = 0;
		
		result = i/0;
		
		try {
			result = i/0;
		} 
		
		catch (Exception e) {
			System.out.println("Arithmetic Error!");
			return;
		}
		System.out.println("Execution ended");
		System.out.println("End of demo");		
	}

}
