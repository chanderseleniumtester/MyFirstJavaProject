package selenium;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import selenium.Dog;

public class SeralizedDemo {

	public static void main(String[] args) throws Exception
	{
		Dog dog1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog1);
		//-------------------------
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog dl = (Dog) ois.readObject();
		System.out.println(dl.i+" "+dl.j);
		
		

	}

}
