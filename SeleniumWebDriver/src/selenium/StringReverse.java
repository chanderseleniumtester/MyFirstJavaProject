package selenium;

public class StringReverse {

	public static void main(String[] args) {
		String name ="Tarun Chander";
		System.out.println(name);
		StringBuilder Input = new StringBuilder();
		Input.append(name);
		System.out.println(Input);
		Input = Input.reverse();
		System.out.println(Input);
	}

}
