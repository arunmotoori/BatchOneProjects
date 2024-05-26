package interfacedemo;

public interface Bank {
	
	String accountType1 = "Savings"; // static and final type
	String accountType2 = "Current"; // static and final type
	
	public void openAccount();  // abstract 
	
	public void withdrawMoney(); // abstract type
	
	public void transferMoney(); // abstract type
	
	public void closeAccount(); // abstract type

}
