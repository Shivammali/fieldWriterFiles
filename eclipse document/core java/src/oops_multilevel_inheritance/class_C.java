package oops_multilevel_inheritance;

public class class_C {
	
	public static void StudInfo5() {
		int StudId=105;
		String StudName="prathamesh";
		
		System.out.println(StudId+" "+StudName);	
	}
	public void StudInfo6() {
		int StudId=106;
		String StudName="himanshuu";
		
		System.out.println(StudId+" "+StudName);	
	}
	
	public static void main(String[] args) {
		
		StudInfo5();
		
		class_C cd=new class_C();
		cd.StudInfo6();

	}

}
