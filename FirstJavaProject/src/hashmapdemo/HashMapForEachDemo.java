package hashmapdemo;

import java.util.HashMap;

public class HashMapForEachDemo {

	public static void main(String[] args) {
		
		HashMap<String,Object> hmap = new HashMap<String,Object>();
		
		hmap.put("Company","Honda");
		hmap.put("Model","Amaze");
		hmap.put("Price",900000);
		hmap.put("Milage",14.12);
		hmap.put("Color","Grey");
		
		for(String k : hmap.keySet()) {
			
			System.out.println(k+" : "+hmap.get(k));
			
		}
		
		

	}

}
