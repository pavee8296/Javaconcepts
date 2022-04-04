package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadToFile {

	public static void main(String[] args) {
		
		
		
		try {
			File reader = new File("F:\\JAVA\\File Handling\\newfile.txt");
			Scanner outreader = new Scanner(reader);
			
			while (outreader.hasNextLine()) {
				String data = outreader.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
