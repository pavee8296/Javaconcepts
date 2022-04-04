package Generaltopics;

	
// We use enum where the variable is going to remain constant eg:Months, seasons and days 
		
	// enums are defined in capital letter 
	
enum Color{ // insted of class we use keyword enum
	
	RED ("red"), GREEN("green"), BLACK("black"); // the types initiated inside the brackets are optional 
	
	// The caps are place holder and in this case it has an internal value 
	// this case is used just for simplicty 
	
	// to fetch the values inside the brackets we have to write the below code 
	private String value; 
	
	Color(String value){
		this.value = value; 
	}
	
	public String getvalue() {
		return value;
	}
	
}
	
public class ENUM {
	public static void main(String[] args) {
		
		Color c1 = Color.RED;
		
			
		System.out.println("Red enum name: " + c1.name());
		System.out.println(""
				+ "Red enum value: "+ c1.getvalue());
		
		for (Color colr :Color.values()) {
			System.out.println("Enum value:" + colr.getvalue());
		}

	}

}
