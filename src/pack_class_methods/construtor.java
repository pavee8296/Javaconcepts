package pack_class_methods;


class BOXES {
	
	int length; 
	int width; 
	int height;


// a construtor does not have a return type & it should be same as the class name 
BOXES(int l, int w, int h){
	
	length = l;
	width = w;
	height = h;
	
}

void setdim(int l, int w, int h) {
	
	length = l;
	width = w;
	height = h;
}

}

public class construtor {

	public static void main(String[] args) {
		
		BOXES blackbox = new BOXES(4,5,10); // calling a constructor with its class name 



	}

}
