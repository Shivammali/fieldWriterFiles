package super_keyword;

public class class_B extends class_A {
	
	public void studinfo1() {
	
		int a=35;
		System.out.println(a);
		System.out.println(super.a);//by using super we can call instsnce varible from parent.
	}
	
public void test() {
		
		System.out.println("child class method running");
		
		super.test();// by using super we can call method from parent
	}
 
class_B(){
	
	System.out.println("child class constructor running");
}


	public static void main(String[] args) {
		
		//class_B ab=new class_B();
		
	//	ab.studinfo1();
	//	ab.test();
		
		new class_B();
	}

}
