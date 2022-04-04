package Java;

class ParentS{  //Super-Class
	 void run() {
		System.out.println("Parent Method");
		
	}  
	}  						

	class OverridingS extends ParentS{  //Sub-Class
	   void run()  //2
	   {
		   System.out.println("Child Method");
	   }  
	   
	  public static void main(String args[]){  
		OverridingS obj = new OverridingS();	
		  obj.run();  
		ParentS obj1 = new ParentS();
		obj1.run();
	  }
}
