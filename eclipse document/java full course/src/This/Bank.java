package This;

public class Bank {
	
	      public void test() {
	    	  
	    	 int a=45;
	    	 System.out.println(a);
	      }
	      public void test1() {
	    	  //this.test();
	    	  int a=35;
	     System.out.println(a);  
	      }

	public static void main(String[] args) {
		
		Bank ab=new Bank();
		ab.test();
		Bank bc=new Bank();
		bc.test1();

	}

}
