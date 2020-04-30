package com.nt.javaprograms;
		import java.io.*;
		import com.nt.javaprograms.SortArray;
		public class Ssort2 
		{
		 
		
		
		
		
		public static void printarray(int a[])
		{
		for(int i=0; i < a.length; i++)
		{
		 
		System.out.print(a[i]+" ");
		}
		 
		}
		public static void main(String[] args) throws IOException
		{
		 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		 
		System.out.println("Enter number of Elements: ");
		int n=Integer.parseInt(b.readLine());
		System.out.println(n);
		int a[] = new int[n]; 
		System.out.println("enter "+n+" elements ");
		for(int i= 0; i< n; i++)
		
		a[i] = Integer.parseInt(b.readLine());
		
		System.out.println("Elements in Array ");
		printarray(a);
		SortArray.Sort(a);
		System.out.println("\n Elements after Sorting");
		printarray(a);
		 
		}
		}
	