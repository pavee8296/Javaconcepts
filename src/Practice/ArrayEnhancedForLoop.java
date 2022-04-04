package Practice;

public class ArrayEnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7};
		
//		Same program with enhanced loop 
		
//		for (int i=0; i<a.length;i++ ){
//		
//			System.out.println(a[i]);
//	}
		
		
		for (int x : a) {
			
			System.out.println(x);
		}

	}

}
