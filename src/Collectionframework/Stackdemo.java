package Collectionframework;

import java.util.Stack;

public class Stackdemo {
	
	// LIFO - first in last out, 
	
	// Eg: while browsing we will open multiple links in a particular website
	// while hitting the back button we must use stack so that it goes back to the preious page and not the home page 

public static void main(String[] args) {
	
	Stack <String> s1 = new Stack<String>();
	
	s1.push("Pavee");
	s1.push("pavithran");
	s1.push("pavi");
	
	System.out.println(s1);
	
	System.out.println(s1.pop());
	
	System.out.println(s1);
	
}
}
