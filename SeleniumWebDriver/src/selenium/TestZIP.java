package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;

public class TestZIP {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Tarun_PC\\workspace\\SeleniumWebDriver\\TestJAVA.txt");
		
		FileOutputStream fos = new FileOutputStream("test.txt");
		
		DeflaterOutputStream dos = new DeflaterOutputStream(fos);
		int data;
		while ((data = fis.read())!= -1) {
		dos.write(data);}
		
		fis.close();
			dos.close();
			
	
          
	}

}
