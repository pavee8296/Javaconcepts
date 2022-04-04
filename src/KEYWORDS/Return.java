package KEYWORDS;

public class Return {
	
	public int add(int x, int y) {
		int z= x+y;
		return z;
	}
		public static void main(String[] args) {
			
			Return z = new Return();
			
			int add = z.add(10,50);
			
			System.out.println(add);
			
		
	}

}
