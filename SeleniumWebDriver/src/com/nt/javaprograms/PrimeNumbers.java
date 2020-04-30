package com.nt.javaprograms;

import java.util.Scanner;

public class PrimeNumbers 
{

  public static void main(String[] args) 
  {
		int count, primecount;
		System.out.println("Enter a Number");
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    System.out.println("Prime numbers between 1 and"+n+"are");
	    
	   
    for(int i=2; i<=n;i++)
	{
    	count=0;
	      for(int j = 1; j <= i; j++) 
	       {
			  if (i%j==0)
			    {
				count++;
			     }
		    
	       }
	        System.out.println(count);
	          if(count==2){
			 System.out.println(i+"is Prime Number");
	          }else{
	        	  System.out.println(i+"is not a prime number");
	          }
	     
	       
	}
	    
		   
  }
}