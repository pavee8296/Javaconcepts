package condition;

import java.util.Scanner;

public class switch_statement {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		char operator; 
		
		System.out.println("Enter the operator +, -, *, / or % :");
		
		operator = sc.next().charAt(0); // we can use scanner only by this method first index should be zero 
		
		
		switch (operator){
		
		case '+' : 
			System.out.println(a + "+" + b + "=" + (a+b));
			break;
			
		case '-' : 
			System.out.println(a + "-" + b + "=" + (a-b));
			break;
			
		case '*' : 
			System.out.println(a + "x" + b + "=" + (a*b));
			break;
			
		case '/' : 
			System.out.println(a + "/" + b + "=" + (a/b));
			break;
			
		case '%' : 
			System.out.println(a + "%" + b + "=" + (a%b));
			break;
			
		default: 
			System.out.println("Enter the correct operator or whole numbers");
			
			
		}
		
	}

}
