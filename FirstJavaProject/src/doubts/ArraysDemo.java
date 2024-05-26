package doubts;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] ar1 = {9,5,7,2,8,4,6};
		
		Integer[] ar = Arrays.stream(ar1).boxed().toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(ar));

	}

}
