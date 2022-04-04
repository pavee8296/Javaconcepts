package OOPSconcepts;

public class exceptionhandling {
	
	public static void main(String args[]){  
				
        
		 try{ 			 			 
		        
			 int a = 814 / 0;          
	         System.out.println(a);
	         
	         int employee[]= null;
		        System.out.println(employee[1]);		        	         	         
		         
		  }
//		 
//		  catch(ArithmeticException e)
//		  {			   
//			   System.out.println("Arithmetic exception has occured"); 
//			   System.err.println("Can't be divided by zero"); // The error msg will be displayed in red color 
//		   }  		 
//		 catch(NullPointerException a ) {
//			 System.out.println("Null pointer exception has occured");
//		 }	 
		 
		 catch (Exception b) { // It is best to use Exception to catch all types of error 
			 
			 System.out.println(b);
			 
			 System.out.println("Exception has occured");
		 }
		 	     
		 finally {
//			 int a,b,sum;
//			 a=10;
//			 b=15;
//					 
//			 sum = a+b;			 			 
			 System.out.println("It doesn't matter if the block throws an error this statement will be executed ");
			 
//			 System.out.println(sum);
			 
		 }
		  
		  }  
	
		
}
