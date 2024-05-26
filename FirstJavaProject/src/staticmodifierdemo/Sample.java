package staticmodifierdemo;

public class Sample {
	
	/*
	public static Sample() {
		
		
		
	}*/
	
	static int a = 10;  // static Global Variable
	int b = 20; //Instance Global Variable
	
	public static void methodOne() {
		
		System.out.println(a);
		//System.out.println(b);
		methodTwo();
		//methodThree();
		Sample s = new Sample();
		System.out.println(s.b);
		s.methodThree();
		
	}
	
	public static void methodTwo() {
		
		System.out.println("Inside methodTwo");
		
		
	}
	
	public void methodThree() {
		
		System.out.println("Inside methodThree");
		System.out.println(a);
		System.out.println(b);
		methodOne();
		methodTwo();
		methodFour();
	
		
	}
	
	public void methodFour() {
		
		System.out.println("Inside methodFour");
		
	}
}
