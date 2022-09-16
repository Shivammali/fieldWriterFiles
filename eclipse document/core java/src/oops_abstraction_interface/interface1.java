package oops_abstraction_interface;

interface interface1 {
	
	public void test();//incomplete method
	
	default void test1() {//default method
		 test4();// declairation of private method
		System.out.println("employee id:"+101);
	}
	
	public static void test3() { // static method
		
		System.out.println("employee name:"+"siddhesh");
	}
	
	private void test4() {//private method
		
		System.out.println("employee address:"+"pune");
	}
}
