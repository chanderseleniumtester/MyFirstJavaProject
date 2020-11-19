package selenium;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Tarun chander";
		char[] tempArray = name.toCharArray();
		System.out.println(tempArray);
		int left, right =0;
		right = tempArray.length-1;
		
		for (left = 0; left < right; left++, right--) {
			char temp = tempArray[left];
			System.out.println(tempArray[left]);
			System.out.println();
			tempArray[left]= tempArray[right];
			tempArray[right]= temp;
			
		}
		for(char c:tempArray)
         System.out.println(c);
	}

}
