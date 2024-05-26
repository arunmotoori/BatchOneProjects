package iteratorloop;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(9);
		alist.add(5);
		alist.add(7);
		alist.add(1);
		alist.add(8);
		
		Iterator<Integer> itr = alist.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
	}

}
