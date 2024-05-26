package interfacedemo;

public class Demo {

	public static void main(String[] args) {
		
		// Bank b = new Bank(); - not possible
		
		HDFC hdfc = new HDFC();
		hdfc.openAccount();
		hdfc.withdrawMoney();
		hdfc.transferMoney();
		hdfc.closeAccount();
		hdfc.openHDFCFlexiAccount();
		
		System.out.println(Bank.accountType1);
		System.out.println(Bank.accountType2);
		
		
	}

}
