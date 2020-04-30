package com.nt.javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
	int first= 1;
	int second =2; 
	System.out.println(first);
	System.out.println(second);
	int temp;
		for (int i = 3; i <=12; i++) {
		int el= first+ second;
		
		System.out.println(el);
		
		first= second;
		second =el;
		
		
	}

	}

}
 