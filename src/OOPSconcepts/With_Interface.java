package OOPSconcepts;


interface transport  {
	int MAX_SPEED = 500; /* 
	->>>In INHERITANCE all the varible are FINAL i.e it is constant it cannot be changed in the program, 
	
	->>> we don't have to use final or static keyword, by default every variable is static in inheritance 
	 					*/
void run ();
	 default void fuel() { 
		// we can define the methods in the interface when we use a defaut key word 
		System.out.println("The fuel is full");
	}
			
}
/*
 * we can achive multiple inhertance using interface 
 */
	class flight extends Without_Interface implements transport {
		
		// we can extend only on class but we can inmplement multipe interface 
		
		// The above line can be written in this way to obtain multiple inheritance 
		
		//*****class flight  extends xyz implements transport,transport1,transport2*****
		
		public void run () { // we must implement all the methods from the interface if we are implementing it in a class 
			
			// We don't have to use the method of the interface only if the class implemenring is abstract 
		
			System.out.println("The flight is under maintance...");
		}
	}

	class train implements transport {
		public void  run () {
			System.out.println("The train is under maintance...");
		}
		
		public void fuel() { // This method overrides the inheritace method 
			System.out.println("The fuel in the train is empty"); 
		}
	}
	
	class ship implements transport{
		public void run() {
			System.out.println("The ship is under maintance... ");
		}
	}
	
	
	class repair {
		public void check (transport t) {
			System.out.println("The transport is refurbished");
			t.run();
		
		}
		
	}
	
	public class With_Interface {

		public static void main(String[] args) {
			
			// We can not create a object for interface but we can use a reference to create the object 
			
			transport t = new ship();
			repair r = new repair ();
			ship s = new ship();
			train tt = new train();
			flight f = new flight();
			
			
			f.fuel();/* Since the flight class implemnts transport interface --  
						we can invoke the method from transport using the flight object this can be done for all objects 
						if the class implemnts the interface 
			 			*/
			tt.fuel(); // we can override the medhods based on over convience 
			tt.run();
			s.run();
			f.run();
			s.fuel();
					

		}

	}

