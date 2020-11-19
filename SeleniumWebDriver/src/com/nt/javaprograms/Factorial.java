package com.nt.javaprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp=1;
		
		for (int i = n; i >1; i--) {
			temp = temp *i;
		}
System.out.println(temp);
	}

}
