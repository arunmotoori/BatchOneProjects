package overloading;

public class Demo {

	public static void main(String[] args) {
		
		WhyOverloading aObj = new WhyOverloading();
		
		aObj.add(1,2);
		aObj.add(1,2,3);
		aObj.add(1,2,3,4);
		aObj.add(1,2.3);

	}

}
