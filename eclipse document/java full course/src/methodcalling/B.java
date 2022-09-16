package methodcalling;

public class B {
	
	public static void aOne() {
		int EmpId=103;
		String EmpName="ajay";
		
		System.out.println(EmpId);
		System.out.println(EmpName);	
		
	}
	
	public static void main(String[]args) {
		
		aOne();
		A.aOne();
		
	}
}
