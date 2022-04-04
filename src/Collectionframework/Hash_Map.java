package Collectionframework;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		// key are stored in set & values are stored in list 
		
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		// Key is string type and the values are integer type 
		
		
		// adding values or entry 
		
		map.put("a", 14);
		map.put("b", 05);
		map.put("c", 1996);
		
		System.out.println("Size of the Map: " + map.size());	
		System.out.println(map);
		
		System.out.println(map.get("a")); // to get a value of the key
		
		// contains method 
		
		if(map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("Value for key" + "\"a\"is:- " + a );
		}
		
		// To print all the datas we can use keyset method 
		for (String key : map.keySet()) {
			System.out.println("key: "+ key+ ", value: "+ map.get(key));
		}
		
		
		
		
	}

}
