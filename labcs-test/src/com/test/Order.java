package com.test;

public class Order implements Order_Structure {
	
	//DECLARING VARIABLES
	public String order_id;
	public String no_of_items;
	
	//CONSTRUCTOR
	public Order(String order_id, String no_of_items) {
		super();
		this.order_id = order_id;
		this.no_of_items = no_of_items;
	}
	
	//PRINTNG ORDER DETAILS
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", no_of_items=" + no_of_items + "]";
	}

	//OVERRIDING FUNCTIONS
	@Override
	public void confirm() {
		System.out.println("Order Confirmed");
	}

	@Override
	public void close() {
		System.out.println("Order Delivered!");
	}

	

}
