package methodcalling;

public class Method_Calling_Within_SingleClass {
	
	public static void aOne() {
		int EmpId=101;
		String EmpName="siddhesh";
		
		System.out.println(EmpId);
		System.out.println(EmpName);
		
	}
	
	public void aTwo() {
		int EmpId=102;
		String EmpName="ajay";
		
		System.out.println(EmpId);
		System.out.println(EmpName);
		
	}
	public static void main(String[]args) {
		aOne();
 Method_Calling_Within_SingleClass ab=new  Method_Calling_Within_SingleClass();
		ab.aTwo();
		
		
		
		
		
	}

}
