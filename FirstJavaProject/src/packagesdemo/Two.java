package packagesdemo;

/*
import packageother.Three;
import packageother.Four;
*/

import packageother.*;

public class Two {

	public static void main(String[] args) {
		
		One one = new One();
		
		System.out.println(one.a);
		one.sampleOne();
		
		Three three = new Three();
		
		System.out.println(three.c);
		
		three.sampleThree();
		
		Four four = new Four();
		
		

	}

}
