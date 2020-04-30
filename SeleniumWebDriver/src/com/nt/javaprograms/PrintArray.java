package com.nt.javaprograms;

import java.util.Scanner;

public class PrintArray
{
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
System.out.println("Enter the number of elements in the array");
int n = scn.nextInt();
int a[]= new int[n]; 
System.out.println("Enter the elements in array");
for (int i = 0; i < n; i++) {
	a[i]=scn.nextInt();
}
System.out.println("Printing Elements in the Array:");
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]+" ");
}
}
}