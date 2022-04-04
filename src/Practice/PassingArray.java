package Practice;

public class PassingArray {

	public static void main(String[] args) {
		
		// How to pass an array to a function 
		
		int a[] = {1,2,3,4,5,6,7};		
		
		printArray(a); // Extra method created 
	}
		
		public static void printArray(int x[]) { // Arguemnet is passed inside the parameter
			for (int y : x) {
				System.out.println(y);
			
		}

	}
	

}
