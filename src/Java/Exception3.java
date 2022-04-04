package Java;

public class Exception3 {
	public static void main(String args[]){
		String value = null; // null;
	 try{  
		   	   System.out.println(value.length());  // 9
		 }  
	 catch(NullPointerException e)    //Exception
	 {
		 System.out.println(e);
	 }  
	 finally
	 {
		  System.out.println("Always executed");  // obj.close();
	 }
	 
		  System.out.println("Successfully Finished");  
	 } 
}
