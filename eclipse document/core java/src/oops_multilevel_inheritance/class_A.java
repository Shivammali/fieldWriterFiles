package oops_multilevel_inheritance;

public class class_A extends class_B {
	
	public static void StudInfo1() {
		int StudId=101;
		String StudName="siddhesh";
		
		System.out.println(StudId+" "+StudName);	
	}
	public void StudInfo2() {
		int StudId=102;
		String StudName="archit";
		
		System.out.println(StudId+" "+StudName);	
	}
	

	public static void main(String[] args) {
		
		 class_A bc=new class_A();
		 
		// class_A.StudInfo1();
		// bc.StudInfo2();
		// class_B.StudInfo3();
		// bc.StudInfo4();
		// class_C.StudInfo5();
		// bc.StudInfo6();
		 
		 bc.StudInfo2();
		 bc.StudInfo4();
		 bc.StudInfo6();
		 bc.StudInfo1();
		 bc.StudInfo4();
		 bc.StudInfo5();
		 

	}

}
