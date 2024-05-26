package doubts;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArrayToArrayList {

	public static void main(String[] args) {
		
		int[] ar = {9,5,1,7};
		
		Integer[] iar = Arrays.stream(ar).boxed().toArray(Integer[]::new);
		
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(iar));
		
		System.out.println(alist);
		
	}

}
