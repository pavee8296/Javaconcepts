package Collectionframework;

public class SingleGenerics <T>{
	
	// same code can be reused  with different datatypes 
	
	T obj;
	
	SingleGenerics(T obj){
		this.obj = obj;
	}

	public T getobject() {
		return this.obj;
		
	}
	public static void main(String[] args) {
	
		SingleGenerics <Integer> iobj = new SingleGenerics <Integer>(10);		
		System.out.println(iobj.getobject()); 
		
		
		SingleGenerics <String> sobj = new SingleGenerics <String>("Using String method");	
		System.out.println(sobj.getobject());

	}

}
