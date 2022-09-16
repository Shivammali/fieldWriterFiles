package collection;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		
		HashMap<String,String> ab=new HashMap<String,String>();
		
		ab.put("sidhesh","sawantwadi");
		ab.put("shivam","mali");
		ab.put("archit","dhuri");
		ab.put("sidhesh","sawantwadi");
		ab.put(null,"sawant");
		
		System.out.println(ab);
		
		System.out.println(ab.get("sidhesh"));
		
		System.out.println(ab.remove("archit"));
		
		System.out.println(ab);
		
		System.out.println(ab.size());
		
		for(String s:ab.keySet()) {
			
		System.out.println(s);
		}
	

	}

}
