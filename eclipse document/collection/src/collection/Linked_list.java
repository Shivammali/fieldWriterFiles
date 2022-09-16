 package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		
		LinkedList<String> al=new LinkedList<String>();
		
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
