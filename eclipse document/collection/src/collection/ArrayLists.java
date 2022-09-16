package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>(); //homogenous ArrayList
		
			
			al.add("Nagar");
			al.add("Kolhapur");
			al.add("Nashik");
			al.add("Pune");
			al.add("sawantwadi");
			al.add("Nashik");
			
			
			System.out.println(al);
	
			Collections.sort(al);//sorting
			
			System.out.println(al);
			
			al.get(0);
			System.out.println(al.get(0));//to get perticuler value
			
			al.set(5,"miraj");// to insert vallue
			System.out.println(al);
			
			al.remove(4);
			System.out.println(al);//to remove vllue
			
			int len=al.size();
			System.out.println(len);//to find size of arraylist
			
			for(int i= 0;i<len;i++) {//reguler Array using for loop
			
				
				System.out.println(al.get(i));
			}
			
			System.out.println();//line breaker 
			
			for(String s:al) {
				
				System.out.println(s);
				
			}
				
	 }
	     
	}


