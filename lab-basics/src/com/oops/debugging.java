package com.oops;

public class debugging {
	public static void main(String[] args) {
		System.out.println("Inside main");
		String s1[] = {"java","sql"};
		String s3[] = null;
		String s2[] = new String[2];
		s2[0] = "mongoDB";
		s2[1] = "javaScript";
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		main1(s2);
		System.out.println("Exiting main");
		
	}
	
	public static void main1(String[] args) {
		System.out.println();
		System.out.println("Inside main1");
		System.out.println(args[0]);
		System.out.println("Exiting main1");
	}
}
