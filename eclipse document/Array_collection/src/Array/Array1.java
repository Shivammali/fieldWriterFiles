package Array;
import java.util.Arrays;

public class Array1 {
		
	public static void main(String[]args) {
		
		String arr[]=new String[5];
		
		arr[0]="siddhesh";
		arr[1]="shivam";
	    arr[2]="archit";
	    arr[3]="manish";
	    arr[4]="patya";
	    
	    int len=arr.length;
	    System.out.println(len);  
	    
	    for(int i=0;i<len;i++) {
	    	
	    	System.out.println(arr[i]);
	    }
	    System.out.println();
	    
	    arr[4]="sarpanch";
	    System.out.println("updated array");
	    for(int i=0;i<len;i++) {
	    	
	    	System.out.println(arr[i]);
	    }		
	     System.out.println();
	     
	    System.out.println("Reverse array");
        for(int i=len-1;i>=0;i--) {
    
	    	System.out.println(arr[i]);
	    }
        System.out.println();
        
        System.out.println("after sorting");
	    Arrays.sort(arr);
	    for(int i=0;i<len;i++) {
	    	System.out.println(arr[i]);
	    	
	    }
	}
}