package pack_class_methods;

// Static data and methods
// Only when a classe is called the static method will be executed 

public class Static_method {

	public static void main(String[] args) {
		

		Static_method s = new Static_method();
	}
	
	class box {
		int length;
		int width;
		int height;
		static int BoxCount;// this is common i don't want to use this data in every class 
		// the meomoory will be allocated only when the class is loaded 
		
		box(int l,int w, int h){
			
			length = l;
			width = w;
			height = h;
			
		}


	static { // only when the class is called this method will be executed 
		System.out.println("this is from static method");
	}

	{// only when a objected is created this instance method will be exectuted 
		System.out.println("this is from instance method");
	}

	}
	
	
}


