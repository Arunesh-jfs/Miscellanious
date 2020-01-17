package com.javaTestPrac;

public class Aeroplane extends Aircraft{
	
	public int aeroplaneId;
	public String aeroplaneName;
	

	public Aeroplane(int aeroplaneId, String aeroplaneName) {
		super();
		this.aeroplaneId = aeroplaneId;
		this.aeroplaneName = aeroplaneName;
	}

	@Override
	public void fly() {
		System.out.println();
		System.out.println("I believe I can Fly!");
	}

	@Override
	public void addFuel() {
		System.out.println();
		System.out.println("Adding Jet Fuel!");
		System.out.println();
	}

	@Override
	public String toString() {
		return "Aeroplane [aeroplaneId=" + aeroplaneId + ", aeroplaneName=" + aeroplaneName + "]";
	}
}
