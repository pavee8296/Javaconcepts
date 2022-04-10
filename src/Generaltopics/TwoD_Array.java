package Generaltopics;

public class TwoD_Array {

	public static void main(String[] args) {
		int [][] numbergrid = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{0}
		};
		
		System.out.println(numbergrid[0][2]);
		
		
		// to print all the array 
		for (int i =0;i< numbergrid.length;i++) {
			for (int j =0; j<numbergrid[i].length;j++) {
				System.out.println(numbergrid[i][j]);
			}
			System.out.println();
		}
	}
}
