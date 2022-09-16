package constructer;

public class Para {
	Para(int a){
		
		System.out.println(3000);
		
	}
	Para(int a,String b){
		
		System.out.println("siddhesh");
	}
	Para(String a){
		System.out.println(5000);
		
	}

	public static void main(String[] args) {
		
     new Para(0);
     new Para(0,null);
     new Para(null);
	}

}
