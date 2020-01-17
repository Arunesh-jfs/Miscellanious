package com.aerospace;


public class Helicopter extends Aircraft{

	@Override
	public void fly() {
		System.out.println("Use rotors");
		
	}

	@Override
	public void addFuel() {
		System.out.println("Add to fuel tank!");
		
	}
	
}