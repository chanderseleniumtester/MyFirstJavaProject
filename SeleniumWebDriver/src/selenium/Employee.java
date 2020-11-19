package selenium;

import java.io.Serializable;
import java.util.Date;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Employee implements Serializable {

	
		
		 private int id;
		private String name;
		 private Float sal;
		private Date doj;
		 Employee(int i, String n, float s, Date d )
		 {
			 id= i;
			 name =n;
			 sal =s;
			 doj =d;
			 
		 }
		 void display()
		 {
			 System.out.println(id+ "\t"+name+"\t"+sal+"\t"+doj);
		 }
		static Employee getData() throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter id::");
		int id = Integer.parseInt(br.readLine());
		
		System.out.println("enter name::");
		String name = br.readLine();
		
		System.out.println("enter salary::");
	Float sal = Float.parseFloat(br.readLine());
	
	Date doj = new Date();
	Employee e = new Employee(id, name, sal, doj);
	return e;
		
		
		}		
	}


