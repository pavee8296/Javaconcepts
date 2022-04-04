package FileHandling;
import java.io.File;

public class FileInformation {
	
	public static void main(String[] args) {
		
		File myfile = new File("F:\\JAVA\\File Handling\\newfile.txt");
		
		if(myfile.exists()) {
			
			System.out.println("File name:" + myfile.getName());
			System.out.println("Absoulute path:" + myfile.getAbsolutePath());
			System.out.println("Readable:" + myfile.canRead());
			System.out.println("Writable:" + myfile.canWrite());
			System.out.println("File size:" + myfile.length());
					
			
		}
		
	}

}
