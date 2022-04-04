package Practice;

public class Boolean {
	
	public static void main (String[] args){

	boolean passed = true;
	boolean missed = false;
	boolean passallpoints = true;
	
	int checkpoint = 0;
			
	if(passed){
		System.out.println(" passed first check point");
		checkpoint = checkpoint +1;			
	}
	if(passed){
		System.out.println(" passed second check point");
		checkpoint = checkpoint +1;			
	}
	if(missed){
		System.out.println(" passed third check point");
		checkpoint = checkpoint +1;			
	}
	if(passed){
		System.out.println(" passed fourth check point");
		checkpoint = checkpoint +1;			
		}
	
	if (checkpoint == 4) {
		System.out.println(" congraulations you have passed all the chekpoints");		
		
	}else 
		System.out.println("\n You missed a check point \n START OVER");
	}

}
