package com.ezshop.oops;

import java.util.ArrayList;

public class App {
public static void main(String[] args) {
	//creatingInstances();
	//workingWithArrays();	
	usingArrayList();
}

private static void usingArrayList() {
	Book book1 = new Book("The God of Small Things: Booker Prize Winner 1997 Paperback","Packt");
	Book book2 = new Book("The Lost Symbol (Robert Langdon)","Penguin");
	ArrayList booksList = new ArrayList();
	booksList.add(book1);
	booksList.add(book2);
	System.out.println(booksList);
}

private static void workingWithArrays() {
	System.out.println("**********");
	Book alfredsFavouriteBook = new Book("Five Point Someone ; What Not To Do at IIT", "Alfred", 12, 1.01f, false);
	//alfredsFavouriteBook.displayDetails();
//	System.out.println(alfredsFavouriteBook);
//	System.out.println(alfredsFavouriteBook.toString());
	//System.out.println(alfredsFavouriteBook.customToString());
	
	//Arrays are static collections.
	Book books[] = new Book[2];
	books[0] = new Book("The God of Small Things: Booker Prize Winner 1997 Paperback","Packt");
	books[1] = new Book("The Lost Symbol (Robert Langdon)","Penguin");
	
	System.out.println("Basic for loop");
	//basic for loop
	for(int i = 0; i<books.length; i++)
	{
		System.err.println(books[i]);
	}
	
	//System.out.println("Enhanced for loop");
	//enhanced for loop
//	for(Book book2 : books) {
//		System.out.println(book2);
//	}
}

private static void creatingInstances() {
	//Creating the reference
	Book book = null; 
	//Initializing the reference
	book = new Book();
	//book.acceptDetails();
	book.displayDetails();
}
}
