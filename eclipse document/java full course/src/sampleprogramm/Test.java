package sampleprogramm;

public class Test {

	Test(){ //zero argument construcor
	
	   System.out.println("siddhesh");
	   
	}
	
	Test(int a){ //parameterised constructor
		
		System.out.println("ajay");	
		
	}
	public static void main(String[] args) {
		
		new Test();
		new Test(50);// put any vallue of int into signature
		Test ab=new Test();
		Test bc=new Test(12);
		
	}
	
	
}
