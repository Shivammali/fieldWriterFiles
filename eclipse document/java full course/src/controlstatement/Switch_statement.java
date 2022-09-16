package controlstatement;

public class Switch_statement {

	public static void main(String[] args) {
	
		String days="F";
		switch(days) {
		
		case"A":
			System.out.println("monday");
		
		case"B":
			System.out.println("tuseday");
		
		case"C":
			System.out.println("wednseday");
			
			break;
			
		case"D":
			System.out.println("thurseday");	
			
		case"E":
			System.out.println("friday");	
			
		default:
			System.out.println("please enter valid number for days");	
			
		}

	}

}
