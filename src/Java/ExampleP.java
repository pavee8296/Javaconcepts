package Java;

public class ExampleP  {
	public static void main(String[] args) {
		bankP obj; 
		
		obj=new SBI();  
		System.out.println("SBI Rate of Interest: "+obj.getRateOfInterest());
		
		obj=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+obj.getRateOfInterest());
		
		obj=new HDFC();  
		System.out.println("HDFC Rate of Interest: "+obj.getRateOfInterest());
		
	
	}

}