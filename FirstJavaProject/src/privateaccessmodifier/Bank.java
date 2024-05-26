package privateaccessmodifier;

public class Bank {
	
	private Bank() {
		
		System.out.println("Inside Bank constructor");
		
	}
	
	private String accountType1;
	private String accountType2;
	
	private void openAccount() {
		
		System.out.println("Account opened");
		accountType1 = "Savings";
		System.out.println(accountType1);
		depositMoney();
		Bank b = new Bank();
		
	}
	
	private void depositMoney() {
		
		System.out.println("Money deposited");
		
	}

}
