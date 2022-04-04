package Java;

class Parent {
	void v1() 				//Declaring function  
	{  
	System.out.println("Inside the Parent Class");  
	}  
}

class Virtualfunction extends Parent{  
    void v1() 				//Overriding function from the Parent class  
    {  
    System.out.println("Inside the Child Class");  
    }  
    public static void main(String args[]){  
    Parent obj = new Virtualfunction(); //Refering the child class object using the parent class  
    obj.v1();  
    }  
    }
