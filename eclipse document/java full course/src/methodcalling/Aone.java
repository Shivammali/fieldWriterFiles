package methodcalling;

public class Aone {
	
	public static void test1(int a) {
	System.out.println("Method A Calling");	
		
	}
	public static void test2(int a,int b) {
		System.out.println("Method B Calling");	
		
	}
	public static void test3(String a,int b) {
		System.out.println("Method C Calling");	
		
	}

	public static void main(String[]args) {
		
		test1(12);
		test2(12,15);
		test3("abc",12);
		
		
	}
}
