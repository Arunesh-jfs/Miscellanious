package com.fruits.abstract_vs_interface;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println();
//		fruitSpecs f1;
//		f1 = new BigBasket();
//		f1.welcome();
//		f1.bill();
//		f1.regards();
//		
//		System.out.println();
//		System.out.println();
//		
		fruitSpecs f2;
		f2 = new Groffers();
		f2.welcome();
		f2.bill();
		f2.regards();
				
		
//		FruitSpecs1 f1;
//		f1 = new BigBasket1();
//		f1.welcome1();
//		f1.bill1();
//		f1.regards1();
//		
//		System.out.println();
//		System.out.println();
//		
//		FruitSpecs1 f2;
//		f2 = new Groffers1();
//		f2.welcome1();
//		f2.bill1();
//		f2.regards1();
		
		FruitBasket f3;
		f3 = new OnlineBas();
		f3.welcome();
		f3.type();
		f3.quantity();
		f3.bill();
		
		FruitBasket f4;
		f4 = new Basket();
		f4.welcome();
		f4.type();
		f4.quantity();
		f4.bill();
		
				
	}

}
