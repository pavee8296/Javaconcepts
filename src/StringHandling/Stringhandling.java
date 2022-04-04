package StringHandling;

import java.util.Arrays;

public class Stringhandling {

	public static void main(String[] args) {
		
		
		/* String is immutable 
		 * 
		 * If we change the values of the string it creates a new object and the previous string is still available 
		 * it dosn't get overwrittern or delted 
		 * 
		 */
		
		String str1 = "I will get married to hae";
		String str2 = " only if hae accepts me";
		
		System.out.println(str1.length());
		
		String result = str1.concat(str2);
		System.out.println(result);
		
		// Format method is used to supply dynamically values inside a static string 
		// %s - to place a string value 
		// %s to place a int value 
		
		// String with dynamic place holders
		String r = String.format("The name of the person is  "+ "%s, and age is %d, ", "pavee", 21);
		System.out.println(r);
		
		
		System.out.println(str1.charAt(5));
		
		if(str1.equals(str2)) 
			System.out.println("Both are same");
		else 
			System.out.println("Both strings are different");
		
		System.out.println(str1.indexOf('r')); // if the charecter is not presnt in the string the output will be -1

		System.out.println(str1.replace('h', 'S'));
		
		
		String[] arr = str1.split(" "); // breaking the string where ever there is space 
		Arrays.asList(arr).forEach(s -> System.out.println(s));
		
		String newStr1 = str1.substring(1,5);
		System.out.println(newStr1);
	}

}
