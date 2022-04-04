package Annotation;

import java.lang.reflect.Method;

// its very rare We use custom annotation in a program 

public class Example {
	
	@customannotation(value = 10) // This annotation can only be used in method 
	public void print() {
		
		System.out.println("Dummy. . . .");
	}

	public static void main(String[] args) throws Exception {
		
			Example obj = new Example();
			
			// i can call the method directly 
			obj.print();
			
			// if i want to fetch the values in the annotation this method has to be used 
				Method m =	obj.getClass().getMethod("Hello"); // Reflection api this an advanced API we are just using this in this case 
		// getclass is going to return the class and getemthod is going to return the method type
				
				customannotation cm = m.getAnnotation(customannotation.class);
				
				System.out.println("value is: " + cm.value());
				
	}

}
