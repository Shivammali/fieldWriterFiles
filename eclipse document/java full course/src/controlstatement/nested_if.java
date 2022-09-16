package controlstatement;

public class nested_if {

	public static void main(String[] args) {
		
		int marks=50;
		
		if(marks>40) {
		System.out.println("marks are greater than 40:");
		
		if(marks<60) {
			System.out.println("marks are less than 60:");
		
		if(marks<100) {
			
			System.out.println("marks are less than100:");	
		}
			
		}
		
		}
	}

}
