package hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteratorDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer>	hmap = new HashMap<String,Integer>();
		
		hmap.put("One",1);
		hmap.put("Two",2);
		hmap.put("Three",3);
		hmap.put("Four",4);
		hmap.put("Five",5);
		
		Set<String> hset = hmap.keySet();
		
		Iterator<String> itr = hset.iterator();
		
		while(itr.hasNext()) {
			
			String k = itr.next();
			
			System.out.println(k+" : "+hmap.get(k));
			
		}

	}

}
