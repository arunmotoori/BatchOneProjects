package overloading;

public class COD {
	
	public COD() {
		
		System.out.println("Inside constructor");
		
	}
	
	public COD(int a) {
		
		System.out.println("Single parameter value is: "+a);
		
	}
	
	public COD(int a,int b) {
		
		System.out.println("Two parameter value is: "+(a+b));
		
	}
	
	public COD(double a) {
		
		System.out.println("-> Single parameter value is: "+a);
		
	}
	
	public COD(int a,double b) {
		
		System.out.println("-> Two parameter value is: "+(a+b));
		
	}
	
	public COD(double a,int b) {
		
		System.out.println("<- Two parameter value is: "+(a+b));
		
	}


}
