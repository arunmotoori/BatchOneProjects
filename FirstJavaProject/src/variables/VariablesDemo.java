package variables;

public class VariablesDemo {
	
	int a = 5; // Global variable
	
	public void sampleOne() {
		
		int b = 4;  // Local variable
		
		System.out.println(a);		
		System.out.println(b);
		
	}
	
	public void sampleTwo() {
		
		System.out.println(a);
		//System.out.println(b);
		
	}

}
