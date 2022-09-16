package String;

public class S1 {
	
	public static void main(String[] args) {
		  String s1 = new String("Hello");    //String 1  
	        String s2 = new String(" World");    //String 2  
	        String s = String.join("",s1,s2);   //String 3 to store the result  
	            System.out.println(s.toString());  //Displays result  
	            
	            String s3="";  
	            String s4="javatpoint";  
	              
	            System.out.println(s3.isEmpty());  
	            System.out.println(s4.isEmpty());
	            
	            String s5="  hello string   ";  
	            System.out.println(s5+" javatpoint");//without trim()  
	          System.out.println(s5.trim()+"javatpoint");//with trim() 
	          
	          
	          String name="javatpoint";  
	          char ch=name.charAt(4);//returns the char value at the 4th index  
	          System.out.println(ch);  
	          
	          String s7="java string split method by javatpoint";  
	          String[] words=s7.split("\\s");//splits the string based on whitespace  
	          //using java foreach loop to print elements of string array  
	          for(String w:words){  
	          System.out.println(w); 

	          }}

}


