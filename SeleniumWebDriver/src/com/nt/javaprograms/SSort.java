package com.nt.javaprograms;

import java.util.Scanner;
import com.nt.javaprograms.SortArray;

public class SSort {
	public static void printarray(int a[])
	{
		System.out.println("Printing Elements in the Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void Sort(int a[])
	{
		int size = a.length,p1, temp;
		
		for (int i = 0; i < size; i++) {
			p1=i;
		for (int j = i+1; j < size; j++) {
			if (a[i]>a[j]) {
				temp =a[i];
				a[i]=a[j];
				a[j] = temp;
				
			}
		}
		
		}
		System.out.println("Sorting the Elements");
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = scn.nextInt();
		int a[]= new int[n]; 
		System.out.println("Enter the elements in array");
		for (int i = 0; i < n; i++) {
			a[i]=scn.nextInt();
		}
		SSort obj = new SSort();
		obj.printarray(a);
		obj.Sort(a);
		obj.printarray(a);
	}
}
