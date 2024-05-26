package hashsetdemo;

import java.util.HashSet;

public class HashSetForEachDemo {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Arun");
		hset.add("Varun");
		hset.add("Tharun");
		
		for(String n : hset) {
			
			System.out.println(n);
			
		}

	}

}
