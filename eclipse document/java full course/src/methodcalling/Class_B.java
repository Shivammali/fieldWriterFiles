package methodcalling;

public class Class_B {
	public static void DivisionB() {
	
	int Roll_Number=60;
	String Name_Of_Student="ajay";
	String Nationality="indian";
		
	System.out.println(Roll_Number);
	System.out.println(Name_Of_Student);
	System.out.println(Nationality);
	}	
	public static void main(String[]args) {
		
		 DivisionB();
		 Class_A.DivisionA();
		
	}

}
