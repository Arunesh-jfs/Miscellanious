package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Set_3TreeSet {
	public static void main(String[] args) {
		
		//1. Create TreeSet
		TreeSet<Number> ts = new TreeSet<>();
		
		//2. Add element
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		
		//3. Check if element exists
		boolean found = ts.contains(1);
		System.out.println(found);
		
		//4. Remove an element
		ts.remove(3);
		
		//5. Iterate over values
		Iterator<Number> itr = ts.iterator();
		while(itr.hasNext()) {
			Number value = itr.next();
			System.err.println(value);
		}
	}

}
