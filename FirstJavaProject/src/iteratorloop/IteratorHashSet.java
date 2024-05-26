package iteratorloop;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorHashSet {

	public static void main(String[] args) {
		
		HashSet<Double> hset = new HashSet<Double>();
		
		hset.add(9.5);
		hset.add(3.12);
		hset.add(4.9);
		hset.add(8.6);
		hset.add(1.58);
		
		Iterator<Double> itr = hset.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}

	}

}
