package multidimensional_array;
import java.util.Arrays;
public class siddhesh {

	public static void main(String[] args) {
		
		int a[][]= new int [2][2];
		
		a[0][0]=50;
		a[0][1]=10;   
	    a[1][0]=40;
	    a[1][1]=20;
	       
	    //cannot find length coz of multidimensional 
	    for(int i=0;i<2;i++) {
	    	for(int j=0;j<2;j++) {
	    		System.out.print(a[i][j]+ " "); 		
	    	  }
	    	System.out.println();
	    	
	    	}
	   
	    	
	    
	    
	    
	}

}
