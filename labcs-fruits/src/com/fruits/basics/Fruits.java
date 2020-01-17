package com.fruits.basics;

public class Fruits {
	
	//abstract data type
	String fruitName;
	
	//primitive data types hold only values
	double quantity;
	double price;
	boolean available;
	
	public Fruits() {
		String fruitName = "orange";
		double quantity = 2;
		double price = 50;
		boolean available = true;
	}
	
	public Fruits(String fruitName, double qantity, double quantity, boolean available) {
		this.fruitName = fruitName;
		this.quantity = quantity;
		this.price = price;
		this.available = available;
	}
	
	@Override
	public String toString() {
		return "Fruits [fruitName=" + fruitName + ", quantity=" + quantity + ", price=" + price + ", available="
				+ available + "]";
	}

	public void getDetails(String fruitName, double quantity, double price, boolean available) {
		this.fruitName = fruitName;
		this.quantity = quantity;
		this.price = price;
		this.available = available;
	}
	
	public void displayDetails() {
		System.out.println(fruitName);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println(available);
	}
	
}
