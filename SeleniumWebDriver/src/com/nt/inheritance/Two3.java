package com.nt.inheritance;

public class Two3 extends One {
int i=20;
void show(){
	System.out.println("Sub Class Method i::"+i);
	System.out.println("i value::"+super.i);
	super.show();
}
}
