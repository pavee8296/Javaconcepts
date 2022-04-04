package Practice;

import java.util.Scanner;

public class CarSpecs {
	
	// number of seats 
	public static void SeatNumbers() {
	 Scanner seat = new Scanner(System.in);
	 System.out.println("Enter the number of seat in the car model:");
	 
	 int seatnumbers;
	 seatnumbers = seat.nextInt();
	 
	 System.out.println(" Total seats available in the model\n" + seatnumbers + " "+ "seats" );
	}
	// wheels	
	public static void wheels() {
		
		System.out.println("Four wheels");
		System.out.println("Alloy wheels");
	}
	// Air Conditioner 
	public static void ac() {
		System.out.println("Air condtioner is availble");
	}
	
	// Air bags
	public static void Airbags() {
		 Scanner airbag = new Scanner(System.in);
		 System.out.println("Enter the number of air bags in the car model:");
		 
		 int numberofairbags;
		 numberofairbags = airbag.nextInt();
		 
		 System.out.println(" Total airbags available in the model\n" + numberofairbags + " "+ "airbags" );
	}
}
