package OOPSconcepts;

// CONCRETE -> Refers to physical object in the real world 

// ABSTRACT -> Is an Idea or concept that does not exist physicallly in the real world 

abstract class Member{
	
	
	abstract void welcome();
	
}

class teacher extends Member{
	void welcome(){
		System.out.println("Welcome Teacher");
	}
}

class student extends Member{
	void welcome() {
		System.out.println("Welcome Student");
	}
}

public class Abstractclass {

	public static void main(String[] args) {
	
		student s = new student ();
		teacher t = new teacher ();
		// we cannot create a object for the abstract class with this syntax 
		Member m = new student(); 
		Member m1 = new teacher();
		// we can create an object for the abstract class using its derived class 

		m.welcome();
		m1.welcome();
	}

}
