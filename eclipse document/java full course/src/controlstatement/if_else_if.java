package controlstatement;

public class if_else_if {

	public static void main(String[] args) {
		
		int marks=105;
		
		if(marks<40){
		System.out.println("fail");
		} 
		else if(marks>=40 && marks<50){
		System.out.println("pass class");		
		}
		else if(marks>=50 && marks<60){
			System.out.println("second class");		
		}	
		else if(marks>=60 && marks<70){
			System.out.println("first class");			
			}
		else if(marks>=70 && marks<100){
			System.out.println("distingutation class");			
			}
		else {
			System.out.println("please enter valid marks");
		}
	}
	
}
		