package Practice;

public class MultiDimArray {

	public static void main(String[] args) {


		// 2 D Array
		
		int a[][] = {{1,2,3,4}, {8,9,10,11}};
		
		// first [] denotes from which row i want the data
		// second [] denotes from which coloumn i want the data
			
//		System.out.println(a[1][2]);
		
		for (int row = 0; row <a.length; row++) {
			for (int coloumn = 0; coloumn < a[row].length; coloumn ++){
				
				// ln is removed so that while printing the number does't print in the next line 
				
				System.out.print(a[row][coloumn]+ "\t"); 
			}
			
			// Use println to move to the next line after the first cycle of the loop 
			System.out.println();
			
		}

	}
	
	
		
	}

