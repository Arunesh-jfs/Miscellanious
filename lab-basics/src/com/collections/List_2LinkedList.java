package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_2LinkedList {
	public static void main(String[] args) {
		
		//1. Create a Linked List
		List<String> l1 = new LinkedList<>();
		
		//2. Add elements
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		l1.add("e");
		
		//3. Check if element exists
		boolean found = l1.contains("f");
		System.out.println(found);
		
		//4. Remove an element
		l1.remove("d");
		
		//5. Iterate over values
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			System.err.println(value);
		}
		
		
	}

}
