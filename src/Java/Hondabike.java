package Java;

class Hondabike extends Bikeabstract{
	 void run()
	 {
		 System.out.println("running safely..");
		 }

	 public static void main(String args[]){
	  Bikeabstract obj = new Hondabike();
	  obj.run();
	 }
}
	 