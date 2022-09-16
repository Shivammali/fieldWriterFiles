package sampleprogramm;// create package

public class Siddhesh { // create class

	public static void test() { // main method
		
		System.out.println ("static method running");// printing statement
	    System.out.println("static method running");
	}
	

	public void test2() {
		
		System.out.println("nonstatic method running");
		System.out.println("nonstatic method running");
	}
	public static void main(String[] args) {
		
		test();
        Siddhesh zahir=new Siddhesh();
        zahir.test2();
		
	}
}
