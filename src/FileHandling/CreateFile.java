package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
	
		try {
			File myobj = new File("F:\\JAVA\\File Handling\\newfile.txt");
			if (myobj.createNewFile()) {
				
				System.out.println("File created: "+ myobj.getName());
			}else {
				System.out.println("file already exists ");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
