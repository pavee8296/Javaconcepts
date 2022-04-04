package Java;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		String firstName = "Venky";
		System.out.println("Hello " + firstName);  //Concatenation Operation
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Name : "+name);
	}
}
