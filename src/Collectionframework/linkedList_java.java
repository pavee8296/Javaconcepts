package Collectionframework;

import java.util.*;

public class linkedList_java {
	
	public static void main (String[] args) {
		
		
		// LinkedList is similar to ArrayList but Linked list is more efficient 
		
		// LinkedList had data 
		
		// LinkedList implements double linked list 
		
		LinkedList <String> i = new LinkedList<String>();
		i.add("a");	
		i.add("b");
		i.addLast("D");
		i.addFirst("the");
		i.add(2,"add" );
		System.out.println(i);
		
		i.remove("a");
		i.remove(2);
		i.removeLast();
		i.removeFirst();
		
		System.out.println(i);
		
	}

}
