package com.fruits.abstract_vs_interface;

public class BigBasket extends fruitSpecs {

	@Override
	public void welcome() {
		System.out.println("Welcome to Big Basket!");
	}

	@Override
	public void bill() {
		System.out.println("Here's Your bill");
	}

	@Override
	public void regards() {
		System.out.println("Thank You fro shopping at Big Basket");
	}
	

}
