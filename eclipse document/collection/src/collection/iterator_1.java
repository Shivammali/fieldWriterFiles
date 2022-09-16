package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class iterator_1 {

	public static void main(String[] args) {
		
ArrayList ab=new ArrayList();//heterogenous Arraylist
		
		ab.add(10);
		ab.add("siddhesh");
		ab.add("ajay");
		ab.add(5464);
		ab.add("ajay");
		ab.add('A');
		ab.add(0);
		
		System.out.println(ab);
		
		System.out.println(ab.size());
		
		//for loop not possible for this we have to use cursor "iterator"
		
		Iterator itr=ab.iterator();
		
		while(itr.hasNext()) {
			
			//System.out.println(itr.next());
			
			
		}
		
	}

}
