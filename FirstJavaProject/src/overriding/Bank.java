package overriding;

public class Bank {
	
	String accountType1 = "Savings";
	String accountType2 = "Current";
	
	public Bank() {
		
		System.out.println("Inside Bank constructor");
		
	}
	
	public void openAccount() {
		
		System.out.println("Bank account opened");
		
	}
	
	public void depositMoney() {
		
		System.out.println("Money deposited into bank");
		
	}

}
