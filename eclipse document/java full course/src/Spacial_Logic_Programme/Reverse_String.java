package Spacial_Logic_Programme;

public class Reverse_String {

	public static void main(String[] args) {
		
		String str="siddhesh";
		String reverse=" ";
		
		System.out.println("Given String is="+str);
		
		char a[]=str.toCharArray(); //string to array conversion
		
		int len=str.length(); //length of String//8
		
		//System.out.println(len);
		
		for(int i=len-1;i>=0;i--) {//7//6//5//4//3//2//1//0
			
			reverse=reverse+a[i];//h//hs//hse//hseh//hsehd//hsehdd/hsehddi//hsehddis
		}
		
		//System.out.println("---------------------");
		
		System.out.println("The reverse is="+reverse);
	}

}
