package selenium;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; 
		int j=1;
		int next;
		
		System.out.println(i);
		System.out.println(j);
		
       for (int c = 1; c < 10 ; c++) {
		next =i+j;
    	i=j;
    	j=next;
    	
    	
    	System.out.println(j);
		
	}
       
       
       
	}

}
