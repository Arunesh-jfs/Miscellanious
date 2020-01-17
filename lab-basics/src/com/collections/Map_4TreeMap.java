package com.collections;

import java.util.Iterator;
import java.util.TreeMap;

public class Map_4TreeMap {
	public static void main(String[] args) {
		
		//1. Create a Tree Map
		TreeMap<Integer,String> tm = new TreeMap();
		
		//2. Add elements
		tm.put(1,"A");
		tm.put(2,"B");
		tm.put(3,"C");
		tm.put(4,"D");
		
		//3. Get mapping by key
		String value = tm.get(2);
		System.out.println(value);
		
		//4. Remove element
		tm.remove(4);
		
		//5. Iterate over value
		Iterator<Integer> itr = tm.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String mapped_value = tm.get(key);
			System.err.println("[ Key: "+key+" value: "+mapped_value+" ]");
		}
		
		
	}
}
