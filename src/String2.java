import java.util.Scanner;

public class String2 {
    void display()
    {
   	String s1= "Abdul Kalam";
	String s2 = "Azad";
	System.out.println("Before concatenating:  "+s1);
	s1 =s1.concat(s2);
	System.out.println("After concatenating:  "+s1);
	System.out.println(s1.length());
	String s5 = "";
	for (int i = 0; i < s1.length(); i++) {
		s5= s5+s1.charAt(i);
	}
	System.out.println(""+s5);
	String s3= "Krishna"; String s4 = new String("Krishna");
	System.out.println("Using == operator:  "+(s3==s4));
	System.out.println("Using .equals():  "+(s3.equals(s4)));
	
	System.out.println("Enter any number");
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	String s9=s1.substring(x);
	String s = s1.substring(6, 10);
	System.out.println(""+s);
	System.out.println(""+s9);
	for (int i = 0; i<=x-1; i++) 
	{	
	char s8=s1.charAt(i);
	System.out.println(s8);
	}
	}
	public static void main(String[] args) 
	{
		String2 obj = new String2();
		obj.display();
    }
}
