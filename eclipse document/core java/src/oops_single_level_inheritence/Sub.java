package oops_single_level_inheritence;

public class Sub extends Super {
	public static void StudInfo1() {
		int StudId=102;
		String StudName="Amar";
		
		System.out.println(StudId+" "+StudName);	
	}
	public void StudInfo2() {
		int StudId=103;
		String StudName="Ajay";
		
		System.out.println(StudId+" "+StudName);	
	}
	 public static void main(String[]args) {
		 
		Sub c=new Sub();
		c.StudInfo2();
		 c.StudInfo4();
		 
		 Sub.StudInfo1();
		 Sub.StudInfo();
	 }	
	
}
