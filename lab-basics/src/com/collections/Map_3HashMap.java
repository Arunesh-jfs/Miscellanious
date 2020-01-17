package com.collections;

import java.util.HashMap;
import java.util.Iterator;

public class Map_3HashMap {
	public static void main(String[] args) {
		
		//1. Create a Hash Map
		HashMap<Integer,String> hm = new HashMap<>();
		
		//2. Add element
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"D");
		
		//3. Get Mapping  by Key
		String value = hm.get(3);
		System.out.println(value);
		
		//4. Remove an element
		hm.remove(3);
		
		//5. Iterate over values
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String mapped_value = hm.get(key);
			System.out.println("[ Key: "+key+" ; value: "+mapped_value+" ]");
			
		}
		
		
	}
}
