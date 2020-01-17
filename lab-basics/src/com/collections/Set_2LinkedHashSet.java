package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_2LinkedHashSet {
	public static void main(String[] args) {
		
		//1. Creating Linked HashSet
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		//2. Add element
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		lhs.add("e");
		
		//3. Check if element exists
		boolean found = lhs.contains("a");
		System.out.println(found);
		
		//4. Remove an element
		lhs.remove("b");
		
		//5. Iterate over values
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			System.err.print(value+",");
		}
	}

}
