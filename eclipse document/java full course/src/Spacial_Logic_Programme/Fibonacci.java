package Spacial_Logic_Programme;

public class Fibonacci {// 1 1 2 3 5 8 13 21 34.................

	public static void main(String[] args) {
		
		int a=0,b=1,c;
		
		System.out.println("Fibonacci series:");
		
		System.out.println(a+" "+b);
		
		
		
		for(int i=1;i<=10;i++) {
			
			c=a+b;
			
			System.out.print(" "+c);
				
			a=b;
			b=c;
			
		}
		

	}

}
