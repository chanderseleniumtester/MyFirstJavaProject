package selenium;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import selenium.Employee;

public class EmployeeObjStore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("//----------------");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FileOutputStream fos = new FileOutputStream("objfile");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	int n = Integer.parseInt(br.readLine());
	System.out.println("how many objects?");
	for (int i = 0; i < n; i++) {
		Employee e1= Employee.getData();
		oos.writeObject(e1);
	}
	oos.close();
	System.out.println("//---------------------------");
	FileInputStream fis = new FileInputStream("objfile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e1 = (Employee) ois.readObject();
			e1.display();
	
	}
	

	
	
	}

