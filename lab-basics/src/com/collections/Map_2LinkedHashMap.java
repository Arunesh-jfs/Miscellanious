package com.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Map_2LinkedHashMap {
	public static void main(String[] args) {
		
		//1. Create Linked Hash Map
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		
		//2. Add elements
		lhm.put(1,"A");
		lhm.put(2,"B");
		lhm.put(3,"C");
		lhm.put(4,"D");
		lhm.put(5,"E");
		
		//3. Get Mapping by Key
		String value = lhm.get(2);
		System.out.println(value);
		
		//4. Remove an element
		lhm.remove(3);
		
		//5. Iterate over values
		Iterator<Integer> itr = lhm.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String mapped_value = lhm.get(key);
			System.err.println("[ Key: "+key+" ; value: "+mapped_value+"]");
		}
		
	}
}
