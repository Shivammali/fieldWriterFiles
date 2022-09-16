package methodcalling;

public class Nonstatic_Class_B {
	public static void DivisionB() {
		
		int Roll_Number=60;
		String Name_Of_Student="ajay";
		String Nationality="indian";
			
		System.out.println(Roll_Number);
		System.out.println(Name_Of_Student);
		System.out.println(Nationality);
		}	
	public static void main(String[]args) {
		
		Nonstatic_Class_B B=new Nonstatic_Class_B();
		B.DivisionB();
		
		Nonstatic_Class_A A=new Nonstatic_Class_A();
		A.DivisionA();
		
	}
		

}
