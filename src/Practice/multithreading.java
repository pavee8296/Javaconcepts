package Practice;

class book{
	void updatedb() {
		for(int i=0; i<=10; i++)
		{		
			System.out.println("vigneshwari");
			
		}
		
	}
}
class num{
	int i;
	void print() {
		for(int i=0; i<=10; i++){		
			System.out.println(i);
		}
	}
}

public class multithreading {

	public static void main(String[] args) {
		
		book bk= new book();
		num  nm= new num();
		bk.updatedb();
		nm.print();
		
	
		
	}

}
