package collectionsframeworkdemo;

import java.util.ArrayList;

public class ArrayListForEachLoopDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(9);
		alist.add(5);
		alist.add(7);
		alist.add(1);
		alist.add(8);
		
		for(Integer e :  alist) {
			
			System.out.println(e);
			
		}

	}

}
