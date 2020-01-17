package com.aerospace;

import java.util.Map;
import java.util.TreeMap;

public class AerospaceApplicationFinal {
	static Map aeroplaneMap = new TreeMap<Integer, Aeroplane>();
	public static void main(String[] args) {
		try {
			Aeroplane aeroplane = new Aeroplane(1,"Indigo");
			addAeroplane(aeroplane);
			findAeroplane(1);
			
			Aeroplane updatedAeroplane = new Aeroplane(1,"SpiceJet");
			updateAeroplane(updatedAeroplane);
			
			deleteAeroplane(2);
		}
		 catch (AerospaceException aerospaceException) {
				System.out.println(aerospaceException);
			}
	}
	private static void addAeroplane(Aeroplane aeroplane) {
		try {
		aeroplaneMap.put(aeroplane.aeroplaneId, aeroplane);
		System.out.println("Aeroplane Added Successfully!");
		} catch (AerospaceException aerospaceException) {
			System.out.println("Unable to add Aeroplane!");
		}
		
		
	}
	private static void findAeroplane(int aeroplaneId) {
		Aeroplane aeroplane = (Aeroplane)aeroplaneMap.get(aeroplaneId);
		if(aeroplane != null) {
			System.out.println("Found Aeroplane : " + aeroplane);
		}
		else {
			System.out.println("Aeroplane not found!");
		}
	}
	private static void updateAeroplane(Aeroplane aeroplane) {
		Aeroplane aeroplane1 = (Aeroplane)aeroplaneMap.get(aeroplane.aeroplaneId);
		if(aeroplane1 != null) {
			aeroplaneMap.put(aeroplane.aeroplaneId, aeroplane);
			System.out.println("Updated aeroplane : " + aeroplane);
		}
		else {
			System.out.println("Aeroplane not found!");
		}
	}
	private static void deleteAeroplane(int aeroplaneId) {
		Aeroplane aeroplane = (Aeroplane)aeroplaneMap.get(aeroplaneId);
		if(aeroplane != null) {
			aeroplaneMap.remove(aeroplaneId);
			System.out.println("Aeroplane Deleted");
			System.out.println(aeroplaneMap);
		}
		else {
			System.out.println("Aeroplane not found!");
		}
	}
}
