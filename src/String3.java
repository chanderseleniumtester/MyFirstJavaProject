
public class String3 {
 void display(){
	String s = "Tarunchander Boora";
	System.out.println(s.indexOf("h"));
	 
	StringBuffer sb = new StringBuffer("Core Java class");
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.reverse());
	System.out.println(sb);
	System.out.println(sb.length());
	char x = sb.charAt(6);
	System.out.println(x);
	sb.deleteCharAt(6);
	System.out.println(sb);
	
	
	 
	 
	 
 }
	public static void main(String[] args) {
		String3 obj = new String3();
		obj.display();

	}

}
