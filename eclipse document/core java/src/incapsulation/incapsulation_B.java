package incapsulation;

public class incapsulation_B {

	public static void main(String[] args) {
		
		 incapsulation_A ab=new  incapsulation_A();
		 
		 ab.setdata(101);
		 ab.setdata("siddhesh");
		 System.out.println("emloyee Id::"+ab.getdata());
		 System.out.println("employee name::"+ab.Getdata());
	}
}
