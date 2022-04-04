package conceptsjava;

public class VariableLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(sum(3,5,7,9));
		System.out.println(mul(3,5,7,9));
	}
//		public static int sum(int...numbers) {
			
			// ... indicated we can pass multiple data to a variable 
			// We can use this, like we use an array 
//			int total = 0;
//			for  (int x : numbers) {
//				total += x;
				
				public static int mul (int... num) {
					
					int tot = 1;
				for (int y: num) {
					tot *= y;
				}
				return tot;
					
				}
			
			
//		}
//			return total;
	}


