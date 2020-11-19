package com.nt.javaprograms;

public class SortArray {
	 
	public static void Sort(int a[])
	{ 
	int n=a.length,i,j,p,temp;
	for (i = 0; i < n - 1; i++) 
	{ 
	p = i; 
	for (j=i+1; j < n; j++)
	{ 
	if (a[p]>a[j]) 
	p=j; 
	 
	} 
	temp=a[p];
	a[p]=a[i];
	a[i]=temp;
	 
	} 
	}
}
