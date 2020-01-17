package com.aerospace;


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
	System.out.println("Use of Jet engines and wings");
	}

	@Override
	public void addFuel() {
		System.out.println("Fuel tank inside the wings!");	
	}

	@Override
	public String toString() {
		return "Aeroplane Details : \n Aeroplane Id=" + aeroplaneId + " \n Aeroplane Name=" + aeroplaneName + "]";
	}
	
}