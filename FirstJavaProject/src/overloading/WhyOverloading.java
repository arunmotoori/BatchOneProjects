package overloading;

public class WhyOverloading {
	
	public void add(int a,int b) {
		
		int c = a+b;
		
		System.out.println("Sum of two numbers is: "+c);
		
	}
	
	public void add(int a,int b,int c) {
		
		int d = a+b+c;
		
		System.out.println("Sum of three numbers is: "+d);
		
	}
	
	public void add(int a,int b,int c,int d) {
		
		int e = a+b+c+d;
		
		System.out.println("Sum of four numbers is: "+e);
		
	}
	
	public void add(int a, double b) {
		
		double c = a+b;
		
		System.out.println("-> Sum of two numbers is: "+c);
		
	}

}
