package Practice;


import java.util.Scanner;
public class Expectionhanling {

	public static void main(String[] arng) {
		
		try {
			
			Scanner scan = new Scanner(System.in);
						System.out.println("Enter value of A:");
		double a = scan.nextInt();
		System.out.println("Enter value of B:");
		double b = scan.nextInt();
		
		System.out.println(a/b);
		
		System.out.println("The Result is:" + a/b);
		
		
		} catch (Exception e) {
			
			System.out.println("Don't use number Zero for the above function");
		}
			
		
	}
}
