package Spacial_Logic_Programme;

public class Pallondrom_number { //121= reverse 121

public static void main(String[]args) {
	
	int no=121,rem,temp,sum=0;
	
	temp=no;
	while(no>0)
	{	
		rem=no%10;//1//2//1
		no=no/10;//12//1//0
		sum=(sum*10)+rem;//1//12//121
		
	}
	if(temp==sum) {
		
	System.out.println("pellondron number");	
	}
	else {
		
		System.out.println("not a pellondron number");	
	}
	
   }
}
