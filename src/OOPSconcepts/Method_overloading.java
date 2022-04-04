package OOPSconcepts;

public class Method_overloading { // // mwthod overloading,

	static int max (int a, int b) {
		return a>b ? a:b; // (?) if true return a, (:) if false return b
	}
	// **** IN methodoverloading There must be changes in the parameter, either the number of arguments or datatypes	
	static double max (double a, double b) { 
		return a>b ? a:b; 
	}
	
	static char max (char a, char b) { 
		return a>b ? a:b; 
	}
	
	public static void main(String[] args) {
		
// if we are calling the method directly without any object creation in the class we have to define the method as static 
			
		System.out.println(max(5,7));
		System.out.println(max(15.7,19.8)); // same method name with same purpose but the date type is different, 
		System.out.println(max('p','d'));
		
		
	}

}
