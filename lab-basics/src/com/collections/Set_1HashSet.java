package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set_1HashSet {
	public static void main(String[] args) {
		
		//1. Create HashSet
		HashSet<String> hashset = new HashSet<>();
		
		//2. Add element
		hashset.add("a");
		hashset.add("b");
		hashset.add("c");
		hashset.add("d");
		hashset.add("e");
		
		//3. Check if element exists
		boolean found = hashset.contains("a");
		System.out.println(found);
		
		//4. Remove an element
		hashset.remove("b");
		
		//5. Iterate over values
		Iterator<String> itr = hashset.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			System.out.println("Values: "+value);
		}
	}
}
