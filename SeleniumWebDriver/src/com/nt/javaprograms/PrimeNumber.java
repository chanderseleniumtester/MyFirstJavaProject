package com.nt.javaprograms;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    System.out.println(n);
	    int count=0;
	    for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				count++;
			}
		}
	    System.out.println(count);
	    if (count==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}
}
