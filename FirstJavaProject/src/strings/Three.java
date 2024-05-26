package strings;

public class Three {

	public static void main(String[] args) {
		
		System.out.println(3+4); //Addition operator
		
		//Using + as concatenation operator
		System.out.println("My experience is : "+15);
		System.out.println("3"+4);
		System.out.println("My experience is : "+15+" years");
		
		int y = 15;
		System.out.println("My experience is : "+y+" years");
		
		String a = "1"+99;
		System.out.println(a);
		
		String firstName = "Arun";
		String lastName = "Motoori";
		String fullName = firstName+" "+lastName;
		System.out.println(fullName);
		
		String fName = "Varun";
		String lName = new String("Dhawath");
		String fullN = fName+" "+lName;
		System.out.println(fullN);
		
		System.out.println(9+"3");
		
		int m = 5, n = 10;
		
		int sum = m+n;
		
		System.out.println("Sum of m:"+m+" and n:"+n+" is: "+sum);
		
		System.out.println("Sum of "+m+" and "+n+" is "+m+n);
		
		System.out.println("Sum of "+m+" and "+n+" is "+(m+n));
	
	}

}
