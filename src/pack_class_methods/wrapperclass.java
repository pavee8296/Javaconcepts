package pack_class_methods;

public class wrapperclass {

	public static void main(String[] args) {
	
		int i = 10; // Primitive data types 
		
		// we can not use a new class name like we usually create an object  
		
		Integer i1= Integer.valueOf(i); 
		
		/* Boxing, wrapping -> The primitive data types are wrapped inside an class 
		so that we can use this as an object in advanced programming 
		we can also use this in ArrayList 
		 */
		
		int j = i1.intValue(); // Unboxing 
		
		Integer i2 = 20; //  Integer.valueOf(20) -> Auto Boxing 
		
		int k = i2; // Autounboxing 
		
		// We can change a string value into an int using this method 
		
		String s= "123";
		
		int i4 = Integer.parseInt(s);
		
		System.out.println(i4);
		
		
		
		

	}

}
