package Practice;

import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Choice;
				
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("MENU:");
		System.out.println("1.Snacks");
		System.out.println("2.Meals");
		System.out.println("3.Drinks");
		
		
		System.out.println("Enter any one of the Choice(1-3) from the above  Menu:");
		
		Choice=sc.nextInt();
		
	// list of items in the menu 
		
		switch(Choice) {
			
		case 1: 
			
			
			String snacks [] = new String [4];
			snacks [0] = "samosa";
			snacks [1] = "Bread";
			snacks [2] = "pani poori";
			snacks [3] = "Cake";
			snacks [4] = "something";
			
			
			System.out.println("Items availabe in snacks");
			System.out.println("1."+ " " +snacks[0]);
			System.out.println("2."+ " " +snacks[1]);
			System.out.println("3."+ " " +snacks[2]);
			System.out.println("4."+ " " +snacks[3]);
			break;
			
			
		case 2: 
						
			String Meals [] = new String [3];
			Meals [0] = "Breakfast";
			Meals [1] = "Lunch";
			Meals [2] = "Dinner";
			
			
			System.out.println("Items availabe in Meals");
			System.out.println("1."+ " " + Meals[0]);
			System.out.println("2."+ " " + Meals[1]);
			System.out.println("3."+ " " + Meals[2]);
			break;
			
		case 3: 
					
			String Drinks [] = new String [3];
			Drinks [0] = "Hot drinks";
			Drinks [1] = "Cold drinks";
			Drinks [2] = "Water";
			
			
			System.out.println("Items availabe in Drinks");
			System.out.println("1."+ " " + Drinks[0]);
			System.out.println("2."+ " " + Drinks[1]);
			System.out.println("3."+ " " + Drinks[2]);
			break;
			
			
			
			
		}
		
		

	}

	

}
