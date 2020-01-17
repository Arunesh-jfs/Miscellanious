package com.test;

public class SpecialOrder extends Order {

	//DECLARING VARIABLES
	int s_orderId;
	
	//CONSTRUCTOR
	public SpecialOrder(int order_id, int no_of_items) {
		super(order_id, no_of_items);
		this.order_id = order_id;
		this.no_of_items = no_of_items;
	}
	
	//OVERRIDDEN FUNNCTIONS
	@Override
	public void confirm() {
		System.out.println("Special Order Confirmed");
	}

	@Override
	public void close() {
		System.out.println("Special Order Delivered!");
	}
	
	
	//OTHER FUNCTION
	public void dispatch() {
		System.out.println("Special Order Dispatched!");
	}

}
