package inheritance;

public class Demo {

	public static void main(String[] args) {
		
		HDFCBank hdfc = new HDFCBank();
		hdfc.hdfcBankSpecialLoanType = "LoanType1";
		hdfc.openHDFCFlexiAccount();
		hdfc.accountType1 = "Savings";
		hdfc.accountType2 = "Current";
		hdfc.openAccount();
		hdfc.depositMoney();
		hdfc.transferMoney();
		hdfc.withdrawMoney();
		
		AxisBank axis = new AxisBank();
		axis.axisZeroBalanceAccountType = "zero balance one";
		axis.reverseMoneyTransfer();
		axis.accountType1 = "Savings";
		axis.accountType2 = "Current";
		axis.openAccount();
		axis.depositMoney();
		axis.withdrawMoney();
		axis.transferMoney();
		
		ICICI icici = new ICICI();
		icici.highInterestAccountType = "high interest one";
		icici.noDebitCardFeesApply();
		icici.accountType1 = "Savings";
		icici.accountType2 = "Current";
		icici.openAccount();
		icici.depositMoney();
		icici.withdrawMoney();
		icici.transferMoney();
		
		Bank bank = new Bank();
		bank.accountType1 = "Savings";
		bank.accountType2 = "Current";
		bank.depositMoney();
		bank.openAccount();
		bank.withdrawMoney();
		bank.transferMoney();
		
		
	}

}
