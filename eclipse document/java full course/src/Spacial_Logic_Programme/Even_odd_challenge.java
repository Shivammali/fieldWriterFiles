package Spacial_Logic_Programme;

public class Even_odd_challenge {

	public static void main(String[] args) {
     
		System.out.println("All even numbers:");
		
		for(int i=1;i<=100;i++) {
			
			if(i%2==0) {
			System.out.print(i+" ");	
				
			}
		}
		System.out.println();
		
		System.out.println("All odd numbers:");
		
         for(int j=1;j<=100;j++) {
			
			if(j%2!=0) {
			System.out.print(j+" ");	
				
			}
		}

	}

}
