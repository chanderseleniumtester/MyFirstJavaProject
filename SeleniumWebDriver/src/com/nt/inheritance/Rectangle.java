package com.nt.inheritance;

public class Rectangle extends Square {
private double b;
public Rectangle(double x, double y) {
	// TODO Auto-generated constructor stub
	super(x);
	b=y;
	
}
void area()
{
	System.out.println("Area of Rectangle::"+l*b);
	}
}
