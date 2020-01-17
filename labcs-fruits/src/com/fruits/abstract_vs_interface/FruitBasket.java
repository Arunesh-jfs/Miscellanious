package com.fruits.abstract_vs_interface;

public abstract class FruitBasket {
	public abstract void welcome();
	public abstract void type();
	public abstract void quantity();
	public abstract void bill();
}

class OnlineBas extends FruitBasket{
	 
	@Override
	public void welcome() {
		System.out.println();
		System.out.println("Welcome to our Online Fruit Shop!");
		System.out.println();	
	}
	
	@Override
	public void type() {
		System.out.println("Type of fruit : --------------");
	}

	@Override
	public void quantity() {
		System.out.println("Quantity of fruit : ------------");
		
	}

	@Override
	public void bill() {
		System.out.println("Your bill : ---------------");
	}
}


class Basket extends FruitBasket{

	
	@Override
	public void welcome() {
		System.out.println();
		System.out.println("Welcome to our Fruit Shop! Grab a basket!");
		System.out.println();	
	}

	@Override
	public void type() {
		System.out.println("Type of fruit : --------------");
	}

	@Override
	public void quantity() {
		System.out.println("Quantity of fruit : ------------");

	}

	@Override
	public void bill() {
		System.out.println("Your bill : ---------------");

	}

	
	
	
}
