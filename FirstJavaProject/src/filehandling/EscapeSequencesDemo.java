package filehandling;

public class EscapeSequencesDemo {

	public static void main(String[] args) {
		
		String str1 = "arun\\motoori";
		String str2 = "I love \"Java\" programming";
		String str3 = "My name is Arun Motoori.\nI love Java programming.";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
