package Spacial_Logic_Programme;

public class count_digit_find {
	
	public static void main(String[]args) {
		
		int n=525255644;
		int count=0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("number of digit:"+count);
	}

}
