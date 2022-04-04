package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
public class FileToWrite {
	
	public static void main(String[] args) {
		
		try {
			FileWriter write = new FileWriter("F:\\JAVA\\File Handling\\newfile.txt");
			
			write.write("she  is a gorgeous women");
			write.close();
			
			System.out.println("Succefully writtern on the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
