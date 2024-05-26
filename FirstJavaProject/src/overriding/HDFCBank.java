package overriding;

public class HDFCBank extends Bank {
	
	String accountType1 = "HDFC Savings";
	String accountType2 = "HDFC Current";
	String hdfcFlexiAccountType = "HDFC Flexi";
	
	public HDFCBank() {
		
		System.out.println("Inside HDFCBank constructor");
		
	}
	
	public void openHDFCFlexiAccount() {
		
		System.out.println("Flexi HDFC Account is opened");
		
	}
	
	public void openAccount(int a) {
		
		System.out.println("HDFC Bank account opened");
		
	}
	
	@Override
	public void depositMoney() {
		
		System.out.println("Money deposited into HDFC Bank");
		
	}

}
