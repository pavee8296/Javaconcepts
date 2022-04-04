package Java;

public class inner {
	 class Inner { 
	       public void show() { 
	            System.out.println("In a nested class method"); 
	       } 
	    }
	 public static void main(String[] args) { 
	inner.Inner in = new inner().new Inner(); 
	        in.show(); 
	    } 
}
