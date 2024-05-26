package privateagain;

public class Demo {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		
		c.setModel("Inspiron 15");
		String model = c.getModel();
		System.out.println(model);
		
		c.setNoOfProcessors(4);
		int number = c.getNoOfProcessors();
		System.out.println(number);
		
		c.callMethods();
		
	}

}
