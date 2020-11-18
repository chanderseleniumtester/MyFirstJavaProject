
public class String1 {
void display()
{
 String Fn = "Tarunchander";	
 String Ln = new String(" Boora");
 String name = Fn.concat(Ln);
 System.out.println(name);
 System.out.println(name.length());
 String Fn2 = new String("Tarunchander");
 boolean x = Fn.equals(Fn2);
 boolean y = Fn==Fn2; 
 System.out.println(""+x);
 System.out.println(""+y);
 System.out.println(name.charAt(5));
 System.out.println(Fn.toUpperCase());
 System.out.println(Fn.toLowerCase());
 String Ln2 = "boora";
 System.out.println(Ln.equalsIgnoreCase(Ln2));
 System.out.println(Ln2.startsWith("B"));
 String s2 = Fn.substring(5);
 System.out.println(s2);
 String s3 = name.substring(5,18);
 System.out.println(s3);
 String s4 = "  tarun123  ";
 System.out.println(s4.trim());
 System.out.println(name.replace("a", "Q"));
 String s5= "hahahaha";
 System.out.println(s5.replace("h", "j"));
 
		 
}
	public static void main(String[] args) {
		String1 obj = new String1();
		obj.display();
		
	}

}
