package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_1ArrayList {
	public static void main(String[] args) {
		
		//1.Create arrayList
		List<String> l1 = new ArrayList<>();
		
		//2. Add Element
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		
		//3. Check if element exists
		boolean found = l1.contains("a");
		System.out.println(found);
		
		//4. Remove element
		l1.remove("c");
		
		//5. Iterate over values
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()){
			String value = itr.next();
			System.err.println(value);
		}
//		SORTING A LIST
		
//		List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");  
//		List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
//		sortedList.forEach(System.out::println); 
		
		
			
	}

}
