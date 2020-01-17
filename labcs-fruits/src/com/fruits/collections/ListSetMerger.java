package com.fruits.collections;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListSetMerger {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(20);
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>();
		set.add(123);
		set.addAll(list);
		System.out.println(set);
		
		//-------------------------------------------------------------------------
		
		System.out.println();
		System.out.println();
		
		//-----------------ITERATOR EXAMPLE USING MAPS----------------------------
		
		Map<String, String> mapA = new HashMap<>();
		mapA.put("key1", "element 1");
		mapA.put("key2", "element 2");
		mapA.put("key3", "element 3");
		Set keys = mapA.keySet();
		
		Iterator<Number> iterator = keys.iterator();
		System.out.println(mapA.size());
		
		while(iterator.hasNext()) {
			Object key = iterator.next();
			Object value = mapA.get(key);
			System.out.println(value);
			
		}
	}

}