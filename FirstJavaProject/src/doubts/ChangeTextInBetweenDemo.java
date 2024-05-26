package doubts;

public class ChangeTextInBetweenDemo {

	public static void main(String[] args) {
		
		String str = "www.gwagle.com";  
		
		String[] ar = str.split("\\.");

		String domain = ar[1];
		
		String finalStr = domain.replace("wa","oo");
	
		System.out.println(finalStr);
		

	}

}
