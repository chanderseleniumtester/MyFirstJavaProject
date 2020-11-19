package selenium;

import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class ReverseOfString1 
{
	public static void main(String[] args) 
	
	{
		String name= new String("Tarun");
		System.out.println(name);
		char[] name1 = name.toCharArray();
		System.out.println(name1);
		
		int size= name1.length;
		System.out.println(size);
		//System.out.println(name1[0]);
		
		for (int i= size-1 ; i>=0; i--)
		{
			System.out.println(name1[i]);
		
		}	
	}
}
