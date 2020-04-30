
public class ClassA {
	
	//This is a program to explain the Static Block and Static Method and Static Variable
	//----------------------------------
	//----------------------------------
	
	void display()
	{
		System.out.println("This is Normal Method");
	}
	static void show()
	{
		System.out.println("This is Static Method ---> show");
	}
	static
	{
	System.out.println("This is first static block");
	
	}

	public static void main(String[] args)
	{
		
		System.out.println("This is main method");
		//show();

	}
	static int a=90; 
	static
	{
		System.out.println("This is Second Static Block");
		ClassA.show(); // 1st way to call the static method
		show();      //  2nd way to call the static method   
		//display();   ---> Cannot make static reference to the non-static method display() from ClassA
		//ClassA.display();     ---> Cannot make static reference to the non-static method display() from ClassA
		System.out.println("Static variable is a ---->"+a);
	}
	

}
