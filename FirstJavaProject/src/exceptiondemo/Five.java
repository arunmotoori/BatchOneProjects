package exceptiondemo;

public class Five {

	public static void main(String[] args) {
		
		int a = 9, b = 0;
		
		int result = 0;
		
		try {
			result = a/b;
		}catch(Throwable e) {  // Use can use Exception, Throwable or ArithmeticException
			System.out.println(e);
		}
		
		System.out.println(result);

	}

}
