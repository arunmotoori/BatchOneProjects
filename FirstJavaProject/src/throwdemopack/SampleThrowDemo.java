package throwdemopack;

import java.util.Scanner;

public class SampleThrowDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible for voting.");
		}else {
			throw new Exception("You are not eligible for voting.");
		}
	
		System.out.println("Voting process");
	
	}

}
