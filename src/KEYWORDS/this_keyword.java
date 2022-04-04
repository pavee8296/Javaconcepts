package KEYWORDS;

public class this_keyword {

	// this refers to the current object to the method we are currently in 
	

	
	private String name; 
	private int a; 
	
	//this can also be used in consturcutors 
	
	public this_keyword(String name, int a) {
		this.name = name;
		this.a = a; 		
	}
	
// what is ww need to use this keyword in another constructor 
	
	public this_keyword() { // to call the other constructor we use this keyword 
		
		this("pavee",0); //  java knows you are calling a constructor when we use this keyword 
		
	}	
	public void setname(String name) {
		this.name = name;
	}
	public String getname () {
		return name;
		
	}
	
	/* the point of static method is to be used ouside the context of any particular object of that class 
	 * so we can not this keyword in this  
	 */
	public static void student() {
//		this.name;
		
			
	}
	
	public static void main(String[] args) {
		
		this_keyword na = new this_keyword();
		na.setname("pavee");
			
	System.out.println(na.getname());
	}

	
}
