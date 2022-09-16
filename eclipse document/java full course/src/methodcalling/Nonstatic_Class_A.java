package methodcalling;

public class Nonstatic_Class_A {
	
	public void DivisionA() {
		
		int Roll_Number=50;
		String Name_Of_Student="siddhesh";
		String Nationality="indian";
			
		System.out.println(Roll_Number);
		System.out.println(Name_Of_Student);
		System.out.println(Nationality);
			
	}
	public static void main(String[]args) {
		
		
		
		 Nonstatic_Class_B A=new  Nonstatic_Class_B();
		 A.DivisionB();
	}
}
