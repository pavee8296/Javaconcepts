package Collectionframework;


import java.util.TreeMap;

public class Tree_map {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treemap = new TreeMap<>();  
		
		
		// it gets orderd as it wants 
		
		treemap.put(3, "a");
		treemap.put(4, "b");
		treemap.put(1, "c");
		
		System.out.println("Size of the Map: " + treemap.size());	
		System.out.println(treemap);
		
		System.out.println(treemap.get(1)); 
		
			
	}

}
