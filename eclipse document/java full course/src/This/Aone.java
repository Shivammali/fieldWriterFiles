package This;

public class Aone {
	
	    Aone(){
	    	System.out.println("vijay");
	    	
	    }
        Aone(int a){
        	this();/* we cant decide object for vijay
        	so this keyword we used to call */ 
        	System.out.println("ajay");
        	
        }
	public static void main(String[] args) {
		
	
		Aone ab=new Aone(12);


	}

}
