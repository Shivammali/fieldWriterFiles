package collection;

import java.util.LinkedList;

public class Linked_Lis_t2 {

	public static void main(String[] args) {
		
		LinkedList ab=new LinkedList();
		
		ab.add(10);
		ab.add("siddhesh");
		ab.add("ajay");
		ab.add(5464);
		ab.add("  ");
		ab.add('A');
		ab.add(0);
		
        System.out.println(ab);
        
       // Collections.sort(); sorting not possible
        
        int len=ab.size();
        System.out.println(len);
        
        for(int i=0;i<len;i++) {
        	
        	System.out.println(ab.get(i));
        }
        for(Object s:ab) {//for each loop
        	System.out.println(s);
        	
        	
        }
		

	}

}
