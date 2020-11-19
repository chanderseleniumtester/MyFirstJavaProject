import java.util.*;
public class Exception {

	
// This is a program to explain Exceptions
	//-----------------------------
	//-----------------------------
	
	
	public static void main(String[] args) 
	{
		int[] a= new int[3];
		try
		{
			a[0] =10; a[1]=20; a[2]= 30;
			a[3] =40;
		}
		catch (ArrayIndexOutOfBoundsException x) 
		{
			System.out.println(x);
		}
		System.out.println(a[0]);
		System.out.println(a.length);

	}

}
