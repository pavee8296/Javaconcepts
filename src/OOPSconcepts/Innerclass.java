package OOPSconcepts;

class outer{
	int a;
	void print() {
		System.out.println("Outer class. . .");
	}
	
	class inner{ // class written inside another class 
		int b;
		void printb(){
			
			System.out.println(" ");
			
			System.out.println("Inner class. . .");
			
		}
	}
}

public class Innerclass {

	public static void main(String[] args) {
		
		outer o = new outer();
		o.a = 50;
		o.print();
		
		// for inner class we can not use the above method to create an object 
		
		// we have to use the object of the outer class to create an new object for the inner class 
		
		outer.inner i = o.new inner(); // Syntax to create an object for inner class 
		i.printb();
		
		// when the inner class is static ->>>>> outer.inner i = new outer.inner();
		
		// when we look for the file in the file explorer every class will have its own file as the class name 
		
		// where as the inner class file will be saved as ->>>> outer$inner 
		
		
	}

}
