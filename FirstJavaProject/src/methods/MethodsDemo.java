package methods;

public class MethodsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		methodOne(); 
		
		System.out.println("main method ended");
		
	}

	public static void methodOne() {
		
		System.out.println("Inside methodOne method - started");
		
		methodTwo();
		
		System.out.println("Inside methodOne method - ended");
		
	}
	
	public static void methodTwo() {
		
		System.out.println("Inside mehtodTwo method - started");
		
		methodThree();
		
		System.out.println("Inside mehtodTwo method - ended");
		
	}
	
	public static void methodThree() {
		
		System.out.println("Inside methodThree method - started");
		
		methodFour();
		methodFour();
		methodFour();
		methodFour();
		
		System.out.println("Inside methodThree method - ended");
		
	}
	
	public static void methodFour() {
		
		System.out.println("Inside methodFour method - started");
		
		System.out.println("Inside methodFour method - ended");
		
	}

}
