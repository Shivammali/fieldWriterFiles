package Exception_handling;

public class M {
	
	//defining a method  
		 public static int divideNum(int m, int n) {  
		        int div = m / n;  
		        return div;  
		        
		        
		    }  
		    //main method  
		    public static void main(String[] args) {  
		        M obj = new M();  
		        
		      // System.out.println( obj.divideNum(45,0));  shows arithmathic Exception
		        
		        
		        
		       try {  
		            System.out.println(obj.divideNum(45,3));  
		        }  
		        catch (ArithmeticException e){  
		            System.out.println("Number cannot be divided by 0");  
		        }  
		          
		        System.out.println("Rest of the code..");
		    } 
		    
}


