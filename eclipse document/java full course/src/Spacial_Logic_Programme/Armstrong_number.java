package Spacial_Logic_Programme;

public class Armstrong_number {  //153= 1*1*1 + 5*5*5 + 3*3*3*

	public static void main(String[] args) {
		
		int no=100,rem,temp,sum=0;
		
		temp=no;
		while(no>0) {
			rem=no%10;//3//5//1
			no=no/10;//15//1//0
			sum=sum+(rem*rem*rem);//27//152//153
		}
		  if(temp==sum) {
			 System.out.println("Armstrong Number:"); 
		 }
		  else {
			  System.out.println("Not a Armstrong Number:");  
			  
		  }
		

	}

}
