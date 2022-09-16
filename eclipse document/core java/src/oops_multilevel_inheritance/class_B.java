package oops_multilevel_inheritance;

public class class_B extends class_C {
	
	public static void StudInfo3() {
		int StudId=103;
		String StudName="manish";
		
		System.out.println(StudId+" "+StudName);	
	}
	public void StudInfo4() {
		int StudId=104;
		String StudName="shivam";
		
		System.out.println(StudId+" "+StudName);	
	}

	public static void main(String[] args) {
		StudInfo5();
		StudInfo3();
		
		class_B ab=new class_B();
		ab.StudInfo4();
		
		ab.StudInfo6();

	}

}
