package polymorphism;

public class  run_time_method_overriding_AAA extends run_time_method_overriding_BBB  {
	
public void show() {
		
		System.out.println("method no 1");
		
}

	public static void main(String[] args) {
		
		run_time_method_overriding_AAA b=new run_time_method_overriding_AAA();
		
		b.show();
	}

}