package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class TestUNZIP {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Tarun_PC\\workspace\\SeleniumWebDriver\\test.txt");
		FileOutputStream fos = new FileOutputStream("testUnzip");
		
		InflaterInputStream iis = new InflaterInputStream(fis);
		int data;
		while ((data=iis.read())!=-1) 
			fos.write(data);
		fos.close();
		iis.close();
		
		

	}

}
