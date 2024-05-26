package strings;

public class Fourteen {

	public static void main(String[] args) {
		
		String str = "My name is Arun Motoori";
		
		String[] strs = str.split(" ");
		
		for(String s : strs) {
			
			System.out.println(s);
			
		}
		
		System.out.println("------------------");
		
		String str2 = "Selenium-By-Arun";
		
		String[] str2s = str2.split("-");
		
		for(String s2 : str2s) {
			
			System.out.println(s2);
			
		}
		
		System.out.println("------------------");
		
		String str3 = "Selenium143 blogspot com";
		
		String[] str3s = str3.split("4");
		
		for(String s3 : str3s) {
			
			System.out.println(s3);
			
		}
		
		System.out.println("------------------");
		
		String str4 = "My name is Ramin";
		
		//  System.out.println(str4.split(" ")); - Object reference of Array will be printed
		
		String[] a = {"Arun","Varun","Tharun"};
		
		// System.out.println(a); - Object reference of Array will be printed
		
		

	}

}
