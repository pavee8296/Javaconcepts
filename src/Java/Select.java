package Java;

import java.util.Scanner;

public class Select {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();		
		switch (day) {   //1
		case 1:
			System.out.println("Sunday");		//1
			break;
		case 2:
			System.out.println("Monday");		//2
			break;
		//Case 7:
		default:
			System.out.println("Data Entered is wrong");
			break;
		}
	}
}