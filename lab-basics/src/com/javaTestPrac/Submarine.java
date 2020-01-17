package com.javaTestPrac;

public class Submarine extends WaterVessels{
	
	//Variables
	public int id;
	public String name;
	
	//Constructor
	
	
	public Submarine(int id) {
		super();
		this.id = id;
	}

	public Submarine(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Submarine(String name) {
		super();
		this.name = name;
	}
	
	//Overridden Functions 
	@Override
	public void can() {
		System.out.println("Can go Underwater");
	}

	@Override
	public void up() {
		System.out.println("Up!");
	}

	@Override
	public void down() {
		System.out.println("Down!");
	}

	@Override
	public void aim() {
		System.out.println("Aim!");
	}

	@Override
	public void fire() {
		System.out.println("Fire!");
	}

	
	//To String method
	@Override
	public String toString() {
		return "Submarine [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
