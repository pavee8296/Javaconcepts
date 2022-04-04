package OOPSconcepts;

import java.io.*;

public class throws_execption  {

	public static void main(String[] args) {	
			
				
		// These errors are known as checked expection we can find these errors while compoling 
		 File file = new File("abc.txt");
		 
			try {
				FileInputStream fs = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 // it will create a throw in the main method 
		 
		 System.out.println("After error");
		
		double balance = 600, withdraw = 1000;
		 
			try {
				if (balance<withdraw)
				throw new InsufficentException(withdraw-balance);
				// we have to pass the argument for the constructor when new onject is created 
			}catch(InsufficentException e) {
				System.out.println("Not enough money");
				
			}
			 
		// if we click the red highlight it will create a clas insufficientexcetion  class 
			
		

	}

}
