package com.test;

public class NormalOrder extends Order {

		//DECLARING VARIABLES
		int n_orderId;
		
		//CONSTRUCTOR
		public NormalOrder(String order_id, String no_of_items) {
		super(order_id, no_of_items);
		this.order_id = order_id;
		this.no_of_items = no_of_items;
		}

		
		//OVERRIDDEN FUNNCTIONS
		@Override
		public void confirm() {
			System.out.println("Normal Order Confirmed");
		}

		@Override
		public void close() {
			System.out.println("Normal Order Delivered!");
		}
		
		
		//OTHER FUNCTION
		public void dispatch() {
			System.out.println("Normal Order Dispatched!");
		}
		
		public void receive() {
			System.out.println("Normal Order Received!");
		}

}
