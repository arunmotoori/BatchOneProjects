package strings;

public class Thirteen {

	public static void main(String[] args) {

		String str = "I love Java programming.";
		
		String searchstr = "Python";
		
		if(str.indexOf(searchstr)==-1) {
			
			System.out.println(searchstr+" is not found");
			
		}else {
			
			System.out.println(searchstr+" is found");
			
		}

	}

}
