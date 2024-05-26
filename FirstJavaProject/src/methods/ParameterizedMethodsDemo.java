package methods;

public class ParameterizedMethodsDemo {

	
	public static void main(String[] args) {
		
	    /*
		System.out.println(additionOfNumbers(5,4));
		System.out.println(subtractionOfNumbers(8,3));
		System.out.println(multiplicationOfNumbers(3,6));
		System.out.println(divisionOfNumbers(9,3));
		*/
		
		/*
		int r1 = additionOfNumbers(5,4);
		int r2 = subtractionOfNumbers(8,3);
		int r3 = multiplicationOfNumbers(3,6);
		int r4 = divisionOfNumbers(9,3);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		*/
		
	}
	
	public static int additionOfNumbers(int a,int b) {
		
		int result = a + b;
		return result;
		
	}
	
	public static int subtractionOfNumbers(int a,int b) {
		
		int result = a - b;
		return result;
		
	}
	
	public static int multiplicationOfNumbers(int a,int b) {
		
		int result = a * b;
		return result;
		
	}
	
	public static int divisionOfNumbers(int a,int b) {
		
		int result = a/b;
		return result;
		
	}
	
	
	
	/*
	public static void main(String[] args) {
		
		welcomeUser("Arun Motoori"); // Argument
		welcomeUser("Varun Dhawath"); // Argument
		
	}
	
	public static void welcomeUser(String name) {  // Parameter
		
		System.out.println("Welcome "+name);
		
	}
	*/

}
