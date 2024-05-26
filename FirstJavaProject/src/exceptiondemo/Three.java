package exceptiondemo;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {

		int a = 9;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		scanner.close();
		
		int result = 0;

		try {
			result = a / num;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println(result);
		System.out.println("End of this program");
	}

}
