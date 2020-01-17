package com.fruits.abstract_vs_interface;

public class Groffers extends fruitSpecs{

	@Override
	public void welcome() {
		System.out.println("Welcome to Groffers!");
	}

	@Override
	public void bill() {
		System.out.println("Here's your bill!");
	}

	@Override
	public void regards() {
		System.out.println("Thank You for shopping at Groffers");
	}
	

}
