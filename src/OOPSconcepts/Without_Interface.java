package OOPSconcepts;



	/*
	 * Tells what to do but not how to do 
	 * 
	 * methods are abstract & public by default 
	 * 
	 * ****IMP****  Methods can in be defined in interface from java 1.8 with the keyword default 
	 * 
	 * Variables are final, static and public by default 
	 * Eg: int a =60; this variable can not be changed in the course of the program 
	 * 
	 * Interface can not be instantiated - no constructors 
	 * 
	 * A class can implement interface/ interfaces 
	 * 
	 * Class implementing an interface should define all abstract method in the interface 
	 * 
	 * *****IMP **** Supports multiple inheritance 
	 * 
	 * ****IMP***** an inheritance can extend another interface / interfaces
	 * 
	 * interface variable mostly ends with suffix "able"
	 * 
	 */
	
	

class vehicle  {
	void run () {
		
	}
}

	class car extends vehicle {
		void run () {
			System.out.println("The car is Running...");
		}
	}

	class bike extends vehicle  {
		void run () {
			System.out.println("The bike is Running...");
		}
	}
	
	class cycle extends vehicle {
		void run() {
			System.out.println("The cycle is Running... ");
		}
	}
	
	
	class mechanic {
		void check (vehicle v) {
			System.out.println("The vechilce is refurbished");
			v.run();
		}
		
	}
	
	public class Without_Interface {

		public static void main(String[] args) {
			car c = new car();
			bike b = new bike ();
			cycle bc= new cycle();
			mechanic m = new mechanic();
		
			m.check(b);
			m.check(c);
			m.check(bc);
			
		

		}

	}

