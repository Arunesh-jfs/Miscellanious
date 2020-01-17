package com.ezshop.oops;


public class Book extends Object {
//abstract data types
	String bookName;
	String publisher;
//primitive datatypes hold only values
	int noOfPages;
	float price;
	boolean available;

	// default constructor
	public Book() {
		bookName = "Sita: Warrior of Mithila (Ram Chandra Series - Book 2)";
		publisher = "Westland (29 May 2017)";
		noOfPages = 376;
		price = 275.00f;
		available = true;
	}
	//parameterized constructor
	//overloaded constructor
	public Book(String pbookName, String ppublisher) {
		bookName = pbookName;
		publisher = ppublisher;
		
	}
	public Book(String pbookName, String ppublisher, int pnoOfPages, float pprice, boolean pavailable) {
		bookName = pbookName;
		publisher = ppublisher;
		noOfPages = pnoOfPages;
		price = pprice;
		available = pavailable;
	}
	public void acceptDetails() {
		bookName = "Sita: Warrior of Mithila (Ram Chandra Series - Book 2)";
		publisher = "Westland (29 May 2017)";
		noOfPages = 376;
		price = 275.00f;
		available = true;
	}

	public void displayDetails() {

		System.out.println(bookName);
		System.out.println(noOfPages);
		System.out.println(publisher);
		System.out.println(price);
		System.out.println(available);
	}
	
//	public String customToString() {
//		return getClass().getName()+ "@" + Integer.toHexString(hashCode());
//	}
	
//	@Override
//	public String toString() {
//		return "Book [bookName=" + bookName + ", publisher=" + publisher + ", noOfPages=" + noOfPages + ", price="
//				+ price + ", available=" + available + "]";
//	}
    
//	@Override
//		public String toString() {
//			
//			return bookName  + "\n" + noOfPages +  "\n" + publisher +  "\n" + price +  "\n" + available;
//		}
	
	
}
