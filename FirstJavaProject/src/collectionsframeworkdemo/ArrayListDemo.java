package collectionsframeworkdemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(9); // 0
		alist.add(5); // 1
		alist.add(7); // 2
		alist.add(8); // 3
		
		System.out.println(alist);
		
		alist.add(6); //4
		
		System.out.println(alist);
		
		System.out.println("-----------------------");
		
		System.out.println(alist.get(0)); // 9
		System.out.println(alist.get(1)); // 5
		System.out.println(alist.get(2)); // 7
		System.out.println(alist.get(3)); // 8
		System.out.println(alist.get(4)); // 6
		
		

	}

}
