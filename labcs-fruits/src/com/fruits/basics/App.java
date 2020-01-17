package com.fruits.basics;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		//Creating obj reference
//		Fruits fruit;
//		//Initializing obj
//		fruit = new Fruits());
		
		
		//fruit.getDetails("Apple",2,100,true);
		//fruit.displayDetails();
		//System.out.println(fruit);
		
		
		Fruits f1 = new Fruits("Apple",10,10,true);
		Fruits f2 = new Fruits("Orane",20,20,true);
		
		ArrayList fruitList = new ArrayList();
		fruitList.add(f1);
		fruitList.add(f2);
		System.out.println(fruitList);
		
	}
}


