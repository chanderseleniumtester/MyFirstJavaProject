package com.nt.inheritance;

public class Four extends Three{
int i;
Four(int a, int b){
	super(a);
	i=b;
	}
void show()
{
System.out.println("Sub class i::" +i);
System.out.println("Super class i::"+super.i);

}
}
