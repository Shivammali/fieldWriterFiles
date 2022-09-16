package Exception_handling;

public class Exception {
	
	 public static void validate(int age) {  
	        if(age>18) {  
	            //throw Arithmetic exception if not eligible to vote  
	            throw new ArithmeticException("Person is eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is not eligible to vote!!");  
	        }  
	    }  
	    //main method  
	    public static void main(String args[]){  
	        //calling the function  
	        validate(10);  
	        System.out.println("rest of the code...");    
	  }    


}


