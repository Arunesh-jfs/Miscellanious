package com.test;

public class Customer extends Customer_Structure{
	
	//DECLARNG VARIABLES
	public String custName;
	public String custLoc;
	
	//CONSTRUCTOR
	public Customer(String custName, String custLoc) {
		super();
		this.custName = custName;
		this.custLoc = custLoc;
	}

	//OVERRIDDEN FUNCTIONS
	@Override
	public void send_order() {
		System.out.println("Order Dispatced!");		
	}

	@Override
	public void receive_order() {
		System.out.println("Order Received! Your food is being prepared");
	}

	
	//PRINTNG CUSTOMER DETALS
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custLoc=" + custLoc + "]";
	}
	
	
	
}
