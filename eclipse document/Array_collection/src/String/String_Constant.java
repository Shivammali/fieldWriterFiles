package String;

public class String_Constant {
	
	public static void main(String[] args) {
		/*String s1="java";//creating string by Java string literal   
		String s4="java";
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("example");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);    
		
		System.out.println(s4); */
		
		
		/* String s1="Sachin"; //sachin 
		   String s2="SACHIN";  //sachin
		  
		   System.out.println(s1.equals(s2));//false  
		   System.out.println(s1.equalsIgnoreCase(s2));//true  */
		
		/*    String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
*/
		   String s1="Sachin";
		   String s2="Ratantata";
		   String s3="Ratantata";

		   System.out.println(s1.compareTo(s2));//0
		   System.out.println(s2.compareTo(s3));//1(because s1>s3)
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
		
	}

}


