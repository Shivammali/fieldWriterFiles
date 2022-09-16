package polymorphism;

public class compile_time_method_overloading {
	
	public void show(int a,int b) {
		
		System.out.println("method no 1");
	}
    public void show(int a) {
		
		System.out.println("method no 2");
	}

	public static void main(String[] args) {
		
		 compile_time_method_overloading b=new compile_time_method_overloading();
		 
		 b.show(10,22);
		 b.show(10);
	}

}
