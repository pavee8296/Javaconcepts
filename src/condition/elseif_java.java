package condition;

import java.util.Scanner;

public class elseif_java {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		num = sc.nextInt();
				
		if(num>0) {
			System.out.println(num +  " Number is positive");
		}
		else if (num ==0) {
			System.out.println(num + " Number is neutral");
		}
			
		else {
				System.out.println(num + " Number is Negative");
			}
	


	}

}
