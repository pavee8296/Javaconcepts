package Java;

public class Maingarbage {

	public void finalize()
	{
	    System.out.println("object is garbage collected");}  
	public static void main(String args[]){  
	 Maingarbage s1=new Maingarbage();  
	 Maingarbage s2=new Maingarbage();  
	
	 s1=null;  
	 s2=null;  
	 
	 System.gc();  
	}  
}
