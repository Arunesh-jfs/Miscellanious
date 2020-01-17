package com.collections;

import java.util.Arrays;

public class Array1 {
	
	public static void main(String[] args) {
		
		// int method 1
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		//int method 2
		int[] b = {1,2,3,4,5,6,7,8,9};
		
		//string array 
		String[] c = {"Hello","World"};
		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println(Arrays.toString(b));
		System.out.println();
		System.out.println(Arrays.toString(c));
	
	}

}

	