package oops_casting_conversion_nonprimitive;

public class AAA extends BBB {
	
	public void test1() {
		
		System.out.println(5000);
	}
	
	public static void main(String[] args) {
		//upcasting
		BBB ab=new AAA();
		
         ab.test();
         
         //downcasting
         
       //  AAA bc=(AAA)ab;
       //  bc.test();
       //  bc.test1();
         
	}

}
