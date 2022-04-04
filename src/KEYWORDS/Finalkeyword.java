package KEYWORDS;

public class Finalkeyword {
	

	// we can use the final keyword infront of a class, variable or a method 
	// if a class is final nothing can be done to it no subclass can extend from it or no method can be over ridden 
	
	final int max = 5;
	
//	void changeMax(int newmax) {
//		max = newmax; 
	//==== we can not change the values assinged to a final variable =========
//	}
	
	
	final public void sayhi() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		
		Finalkeyword f = new Finalkeyword();
		System.out.println(f.max);
		f.sayhi();
	}
}

// the method can not be overidden 

//class newclass extends finalkeyword{
//	public void sayhi() {
//		System.out.println("hiiiiii");
//	}
//}

