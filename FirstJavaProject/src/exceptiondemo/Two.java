package exceptiondemo;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		
		int result = 0;
		
		try {
			
		   result = num1 / num2;
		   
		}catch(Exception e) {
			
			System.out.println("Exception occured and handled in catch block");
			result = num1 / 1;
			
		}
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("Result is "+result);
		System.out.println("End of this program");
		scanner.close();
		

	}

}
