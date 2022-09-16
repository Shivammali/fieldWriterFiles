package methodcalling;

public class Bone {
	
	public void test1(int a) {
		System.out.println("method E calling");
		
	}
	public void test2(int a,int b) {
		System.out.println("method F calling");
		
	}
	public void test3(String b,int a) {
		System.out.println("method G calling");
		
	}
	public static void main(String[]args) {
		
		Aone.test1(12);
		Aone.test2(12,15);
		Aone.test3("abc",12);
		
			
		Bone ab=new Bone();
		ab.test1(12);
		
		Bone bc=new Bone();
		bc.test2(12,15);
		
		Bone ad=new Bone();
		ad.test3("abc",12);
		
		
	}
}
