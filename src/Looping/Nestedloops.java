package Looping;

public class Nestedloops {

	public static void main(String[] args) {
		
		for (int i =1; i<=5; i++) { // outer loop controls the rows 		
			// i = 1;
			
				for (int j =1; j<=5;j++) { // inner loops prints the stars 
					System.out.print("*");
					// unitl j is greater than or equal to 5 this statemnet will print and then it will go break the loop and go for i loop
						}
				// we are using print statement not prinln so that the looped stars doesn't move to the next line
						System.out.print("\n");
				}
		System.out.println(" ");
	
		System.out.println("Triangle program ");
	
		for (int i =1; i<=5; i++) { 				
			
				for (int j =1; j<=i;j++) { 
					System.out.print("*");					
						}			
						System.out.print("\n");
				}
		
	}
	

}
