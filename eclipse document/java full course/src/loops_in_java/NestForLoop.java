package loops_in_java;

public class NestForLoop {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
		 for(int j=i;j<=5;j++) {
			
			System.out.printf( " * " );
		 }
		 System.out.println();
  		}
	   }

}
