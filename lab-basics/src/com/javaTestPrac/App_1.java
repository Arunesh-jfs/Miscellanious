package com.javaTestPrac;

import java.util.LinkedList;
import java.util.List;

public class App_1 {
	
	static List<Integer> l1 = new LinkedList();
	static List<String> l2 = new LinkedList();
	static List<Submarine> l3 = new LinkedList();
	
	public static void main(String[] args) {
		
		//Creating instances
		Submarine s1 = new Submarine(1);
		Submarine s2 = new Submarine("Jal");
//		Submarine s3 = new Submarine(2,"Gaazi")
		
		
		//implementing functions
		add(s1);
		add1(s2);
//		add2(s3);
		find(s1);
		find1(s2);
		update(s1);
		update1(s2);
//		delete(s1);
//		delete1(s2);
		print();		
	}

	private static void find(Submarine s1) {
		boolean value = l1.contains(1);
		System.out.println(value);
	}
	private static void find1(Submarine s2) {
		boolean value1 = l2.contains("Jal");
		System.out.println(value1);
	}

	private static void delete(Submarine s1) {
		l1.remove(s1);
	}
	private static void delete1(Submarine s2) {
		l2.remove("Jal");
	}

	private static void update(Submarine s1) {
		l1.set(0,3);
	}
	private static void update1(Submarine s2) {
		l2.set(0, "Vayu");
	}

	private static void add(Submarine s1) {
		l1.add(s1.id);
	}
	private static void add1(Submarine s2) {
		l2.add(s2.name);
	}
	
	private static void print() {
		System.out.println(l1);
		System.out.println(l2);
	}
	
}
