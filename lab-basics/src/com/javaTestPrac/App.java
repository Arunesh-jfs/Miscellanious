package com.javaTestPrac;

import java.util.Iterator;
import java.util.TreeMap;

public class App {
	
	//Defining TreeMap
	static TreeMap<Integer, Aeroplane> aMap = new TreeMap<>();
	
	public static void main(String[] args) {
		
		//Adding data using Constructors
		Aeroplane aeroplane = new Aeroplane(1,"Indigo");
		
		//Implementing Functions
		addAeroplane(aeroplane);
		findAeroplane(aeroplane);
		updateAeroplane(aeroplane);
		//deleteAeroplane(aeroplane);
		printAeroplane();	
	}

	private static void addAeroplane(Aeroplane aeroplane) {
		aMap.put(aeroplane.aeroplaneId, aeroplane);
	}
	
	private static void findAeroplane(Aeroplane aeroplane) {
		boolean value = aMap.containsKey(aeroplane.aeroplaneId);
		System.out.println(value);
	}
	
	private static void updateAeroplane(Aeroplane aeroplane) {
		Aeroplane a1 = (Aeroplane) aMap.get(aeroplane.aeroplaneId);
		aMap.put(aeroplane.aeroplaneId,aeroplane);
	}

	private static void deleteAeroplane(Aeroplane aeroplane) {
		aMap.remove(aeroplane.aeroplaneId);
	}
	
	private static void printAeroplane() {
		Iterator<Integer> itr = aMap.keySet().iterator();
		while(itr.hasNext()) {
			Integer aeroplane1 = itr.next();
			Aeroplane mapped_value =(Aeroplane) aMap.get(aeroplane1);
			System.out.println(mapped_value);
		}
	}
}
