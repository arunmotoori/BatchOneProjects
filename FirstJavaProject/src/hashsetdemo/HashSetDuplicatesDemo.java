package hashsetdemo;

import java.util.HashSet;

public class HashSetDuplicatesDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		hset.add(9);
		hset.add(7);
		hset.add(5);
		hset.add(9);
		hset.add(9);
		hset.add(6);
		
		System.out.println(hset);

	}

}
