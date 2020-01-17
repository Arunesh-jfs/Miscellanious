package com.test;

import java.util.ArrayList;
import java.util.List;


public class App {

	//DEFINIG LIST
	static List<String> l1 = new ArrayList<>();
	static List<String> l2 = new ArrayList<>();
	static List<String> l3 = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//ADDING DATA USING CONSTRUCTORS
		Customer customer = new Customer("Arunesh","Hyderabad");
		Order order = new Order("1","3");
		
		//IMPLEMENTING FUNCTIONS
		add(customer,order);
		find(customer,order);
//		update(customer,order);
//		delete(customer,order);
		print_1();
	}
	

	//DEFINING FNCTION
	private static void print_1() {
		l3.addAll(l2);
		l3.addAll(l1);
		System.out.println(l3);
	}

	private static void delete(Customer customer, Order order) {
		l2.remove(customer);
		l1.remove(order);
		
	}

	private static void find(Customer customer, Order order) {
		boolean value1 = l2.contains(customer.custName);
		System.out.println("Customer Found : " + value1);
		boolean value2 = l1.contains(order.order_id);
		System.out.println("Order found : "+ value2);
	}

	private static void add(Customer customer, Order order) {
		l2.add(customer.custName);
		l2.add(customer.custLoc);
		l1.add(order.order_id);
		l1.add(order.no_of_items);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//DEFINIF TREEMAP
//	static TreeMap<Customer, Order> aMap = new TreeMap<>();
//	
//	public static void main(String[] args) {
//		
//		//ADDING DATA USING CONSTRUCTORS
//		Customer customer = new Customer("Arunesh","Hyderabad");
//		Order order = new Order(1,3);
//		
//		//IMPLEMENTING FUNCTIONS
//		add(customer,order);
//		find(customer,order);
//		delete(customer,order);
////		update(customer,order);
//		print(customer,order);
//	
//	}
//	
//	//DEFINING FUNCTIONS
//	private static void add(Customer customer, Order order) {
//		aMap.put(customer,order);
//		
//	}
//
//	private static void find(Customer customer, Order order) {
//		boolean value1 = aMap.containsKey(customer);
//		System.out.println("Customer Found : " + value1);
//		boolean value2 = aMap.containsKey(order);
//		System.out.println("Order found : "+ value2);
//	}
//
//	private static void delete(Customer customer, Order order) {
//		aMap.remove(customer);
//		aMap.remove(order);
//	}
//
////	private static void update(Customer customer, Order order) {
////		Customer c1 = (Customer) aMap.get(Customer.custName);
////		Order o1 = (Order) aMap.get(Order.order_id);
////		
////		
////	}
//
//	private static void print(Customer customer, Order order) {
////		Iterator<Customer> itr = aMap.keySet().iterator();
////		while(itr.hasNext()) {
////			Integer key = itr.next();
////			Customer mapped_value = aMap.get(Customer.custName);
////			System.out.println(customer);
////		}
//		System.out.println(customer);
//		System.out.println(order);
//	}
}
