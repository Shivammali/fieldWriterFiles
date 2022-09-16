 package oops_abstraction_interface;

public class impliment implements interface1,interface_2{
	
	public void test() {
		
		System.out.println("incomplete method from interferance 1");
	}
	public void test6() {
		System.out.println("incomplete method from interferance 2");//
		
	}
	public static void main(String[]args) {
		
		impliment ab=new impliment ();
		
		ab.test();
		ab.test1();
		interface1.test3();
		ab.test5();
		ab.test6();
	}

}
