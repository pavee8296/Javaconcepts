package Generaltopics;

public class autoboxing {
public static void main(String[] args) {
	
	int i = 10;
	
	
	// autobox 
	Integer iobj = Integer.valueOf(i);
	System.out.println("Value of Integer obj:" + iobj);
	
	// autounbox 
	
	int i1= iobj; 
	System.out.println("Value of i1: " + i1);
	
	
}

}
