package Exception_handling;

import java.rmi.AccessException;

public class siddhesh {

	public static void main(String[] args) {
		
		try {
		int a=10,b=0,c;
		
		c=a/b;
		
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			
			System.out.println("division by zero is not possible");
		}
		
		System.out.println("further programm smoothly work");
		}
	}


