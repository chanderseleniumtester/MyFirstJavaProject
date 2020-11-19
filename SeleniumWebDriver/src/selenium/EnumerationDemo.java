package selenium;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector V = new Vector();
		for (int i = 0; i <=10; i++) {
			V.addElement(i);
		}
		System.out.println(V);
		Enumeration e =V.elements();
		
		while (e.hasMoreElements()) {
			Integer  i = (Integer) e.nextElement();
			if((i%2)==0)				
				
				System.out.println(i);
				}
	System.out.println(V);
	
	
	}

}
