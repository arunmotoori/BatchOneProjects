package castingdemo;

public class DemoAB {

	public static void main(String[] args) {
		
		ClassA cb = new ClassB();
		ClassB ca = (ClassB)new ClassA();
		
		System.out.println(ca.a);
		System.out.println(ca.b);
		ca.sampleA();
		ca.sampleB();
		
		/*
		 * 
		 * ClassA ca = new ClassB(); - Upcasting 
           ClassB cb = (ClassB)ca; - Downcasting 
Now we can able to access the parent class properties also
		 System.out.println(ca.a);
		 System.out.println(ca.b);
		 ca.sampleA();
		 ca.sampleB();
		 *
		 */

	}

}
