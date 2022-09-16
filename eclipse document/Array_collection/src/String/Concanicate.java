package String;

public class Concanicate {
	
	public static void main(String[] args) {
		  String s1="Sachin ";  
		   String s2="Tendulkar";  
		   String s3=s1.concat(s2);  
		   System.out.println(s3);//Sachin Tendulkar  
		   
		   System.out.println("Zahir"+" Shaikh ");
		   
		   
		   StringBuffer sb=new StringBuffer("Hello ");  
		   sb.append("Java");//now original string is changed  
		   System.out.println(sb);//prints Hello Java  
		   
		   StringBuffer sc=new StringBuffer("Hello ");  
		   sc.insert(6,"Java");//now original string is changed  
		   System.out.println(sc);//prints HJavaello  
		   
		   StringBuffer sp=new StringBuffer("Hello");  
		   sp.replace(1,4,"Java");  
		   System.out.println(sp);//prints HJavalo  
		   
		   StringBuffer sd=new StringBuffer("Hello");  
		   sd.delete(1,3);  
		   System.out.println(sd);//prints Hlo  
		   
		   
		   StringBuffer ab=new StringBuffer("Hello Guys");  
		   ab.reverse();  
		   System.out.println(ab);//prints olleH  

	}

}
