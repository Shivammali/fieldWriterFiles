package This;

public class Thiskeyword {
	   
		   int a=23; //instance variable
		   
		   public void test() {
			   
			   int a=35; // local variable
			  System.out.println(a); 
			  System.out.println(this.a); /*when both variable
			  are having same name of vallu ;a then to call
			  instance vaiable this keyword use. */
			  
		   }
	

	public static void main(String[] args) {
		
		Thiskeyword ab=new Thiskeyword();
		ab.test();
		
	}

}

