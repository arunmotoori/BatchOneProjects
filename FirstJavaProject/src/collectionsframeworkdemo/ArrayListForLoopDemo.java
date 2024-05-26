package collectionsframeworkdemo;

import java.util.ArrayList;

public class ArrayListForLoopDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(9); // 0
		alist.add(5); // 1
		alist.add(7); // 2
		alist.add(1); // 3
		alist.add(8); // 4
		
		System.out.println("Size of alist: "+alist.size());
		
		for(int i=0;i<alist.size();i++) {
			
			System.out.println(alist.get(i));
			
		}
		
		/*
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
		System.out.println(alist.get(3));
		System.out.println(alist.get(4));
		*/
		
	}

}
