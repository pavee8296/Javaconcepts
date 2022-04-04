package Practice;

import java.io.File;
import java.util.Scanner;

public class CreateFIle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			File file = new File("D:\\PAVEE\\Pavithran.docx"); 
		
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNextLine()) {
			
			System.out.println(scanner.hasNextLine());
			
		}
		
		}catch (Exception e) {
			
			System.out.println("Error");
			
		}
		

	}

}
