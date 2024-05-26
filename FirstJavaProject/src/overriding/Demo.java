package overriding;

public class Demo {

	public static void main(String[] args) {
		
		HDFCBank hdfc = new HDFCBank();
		
		System.out.println(hdfc.accountType1);
		System.out.println(hdfc.accountType2);
		System.out.println(hdfc.hdfcFlexiAccountType);
		
		hdfc.openAccount(9);
		hdfc.depositMoney();
		hdfc.openHDFCFlexiAccount();
		
		AxisBank axis = new AxisBank();
		System.out.println(axis.accountType1);
		System.out.println(axis.accountType2);
		System.out.println(axis.axisZeroAccountType);
	
		axis.openAccount();
		axis.depositMoney();
		axis.openZeroAccount();
	
	}

}
