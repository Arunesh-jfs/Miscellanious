package com.collections;

import java.util.Hashtable;
import java.util.Iterator;

public class Map_1HashTable {
	public static void main(String[] args) {
		
		//1. Create HashTable
		Hashtable<Integer,String> ht = new Hashtable<>();
		
		//2. Add elements
		ht.put(1,"A");
		ht.put(2,"B");
		ht.put(3,"C");
		ht.put(4,"D");
		
		//3. Get mapping by key
		String value = ht.get(3);
		System.out.println("Value for key 3: "+value);
		
		//4. Remove a mapping
		ht.remove(2);
		
		//5. Iterate over Values
		Iterator<Integer> itr = ht.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String mapped_value = ht.get(key);
			System.out.println("Key : "+key+" ; value : "+mapped_value);
		}
		
		
		
		
	}
}
