package controlstatement;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("whats your name:");
	      String name=scan.next();
	      
	      System.out.println("whats your age:");
	      int age=scan.nextInt(); 
	      
	      System.out.println("whats your goal:");
	      String aim=scan.next();
	     
	      System.out.println("thank you" + name + "you are" + age + "years old");
	      System.out.println("your goal is" + aim); 
	      
	}
}
