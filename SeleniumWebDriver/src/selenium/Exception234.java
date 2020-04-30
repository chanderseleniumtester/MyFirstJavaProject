package selenium;
public class Exception234
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] a =new int[3];
	try {
		a[0] =10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
	} catch (Exception e) {
		// TODO: handle exception
	}

	
	System.out.println(a[0]);

	System.out.println(a.length);
	}
	
	}