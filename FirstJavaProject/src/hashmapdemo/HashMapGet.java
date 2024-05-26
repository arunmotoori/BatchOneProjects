package hashmapdemo;

import java.util.HashMap;

public class HashMapGet {

	public static void main(String[] args) {
		
		HashMap<String,Object> hmap = new HashMap<String,Object>();
		
		hmap.put("Name","Arun Motoori");
		hmap.put("Experience",17);
		hmap.put("Location","Hyderabad");
		hmap.put("Country","India");
		
		System.out.println(hmap.get("Name")); // Arun Motoori
		System.out.println(hmap.get("Experience")); // 17
		System.out.println(hmap.get("Location")); // Hyderabad
		System.out.println(hmap.get("Country")); // India

	}

}
