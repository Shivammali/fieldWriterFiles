package collection;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
	
		HashSet<String> cars=new HashSet<String>();
		
		cars.add("volvo");
		cars.add("TATA");
		cars.add("TATA");//duplicate not consider in HashSet
		cars.add("Safari");
		cars.add("Bolero");
		
		System.out.println(cars);

		System.out.println(cars.contains("TATA"));
		
		System.out.println(cars.remove("TATA"));
		
		System.out.println(cars);
		
		
		int size=cars.size();
		System.out.println(size);
		
		 //cars.clear();
		 
		// System.out.println(cars);
		
		
	
		//for(int i=0;i<size;i++) { this for loop cant use 
			
		for(String s:cars) {
			
			System.out.println(s);
			
			
			
		
			
		}

	  }
  
	
	}


