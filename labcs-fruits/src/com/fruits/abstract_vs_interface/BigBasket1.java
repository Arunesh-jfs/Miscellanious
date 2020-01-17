package com.fruits.abstract_vs_interface;

public class BigBasket1 implements FruitSpecs1 {

	@Override
	public void welcome1() {
		System.out.println("Welcome to Big Basket!");
	}

	@Override
	public void bill1() {
		System.out.println("here's your bill");
	}

	@Override
	public void regards1() {
		System.out.println("Thank you for shopping at Big Basket");
	}

}
