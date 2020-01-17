package com.fruits.abstract_vs_interface;

public class Groffers1 implements FruitSpecs1 {

	@Override
	public void welcome1() {	
		System.out.println("Welcome to Groffers!");
	}

	@Override
	public void bill1() {
		System.out.println("Here's your bill!");
	}

	@Override
	public void regards1() {
		System.out.println("Thank You for shopping at Groffers");
	}
}

