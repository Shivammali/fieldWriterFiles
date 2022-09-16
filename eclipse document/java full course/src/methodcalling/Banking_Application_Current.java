package methodcalling;

public class Banking_Application_Current {
	
	public void balance_account_For_Current() {
	    int CustId=1001;
	    String Cust_Name="siddhesh";
	    int Cust_Account_Balance=50000;
	    
	    System.out.println(CustId);
	    System.out.println(Cust_Name);
	    System.out.println(Cust_Account_Balance);
			
	}
	public static void main(String[]args) {
		
		 
		 Banking_Application_Saving sav=new  Banking_Application_Saving();
		 sav.balance_account_saving();
		 
		 Banking_Application_Current current=new Banking_Application_Current();
		 current.balance_account_For_Current();
	}		 
}
