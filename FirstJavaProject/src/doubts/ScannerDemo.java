package doubts;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scanner.nextInt();
		System.out.println("Enter any decimal number:");
		double decnum = scanner.nextDouble();
		System.out.println("Enter your name:");
		scanner.nextLine();
		String str = scanner.nextLine();
		scanner.close();
		
		//System.out.println(str);
		System.out.println(decnum);
		System.out.println(num);
		
		

	}

}
