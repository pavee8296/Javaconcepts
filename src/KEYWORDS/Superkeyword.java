package KEYWORDS;

//super keyword is used to access things in the parent class of the class we are working on 
// super keyword is also used to call the constructor of the parent class 

public class Superkeyword {

	public static void main(String[] args) {
		
		dog mydog = new dog();
		cat mycat = new cat();
		
		mydog.makenoise();
		mycat.makenoise(); // used super keyword
		
		}
}

class animal {
	
	public void makenoise() {
		System.out.println("Animals Make Noise");
	}
}

class dog extends animal{
	public void makenoise() {
		System.out.println("Bhoww bhoww");
	}
}

class cat extends animal{
	public void makenoise() {
		super.makenoise();
		System.out.println("Meoww Meoww...!!");
	}
	
}