package strings;

public class Seven {

	public static void main(String[] args) {
		
		String a = new String("Arun");
		String b = new String("Varun");
		String c = new String("Arun");
		
		if(a.equals(b)) {
			
			System.out.println("a is equal to b");
			
		}
		
		if(b.equals(c)) {
			
			System.out.println("b is equal to c");
			
		}
		
		if(c.equals(a)) {
			
			System.out.println("c is equal to a");
			
		}
		
		System.out.println("End of this program");

	}

}
