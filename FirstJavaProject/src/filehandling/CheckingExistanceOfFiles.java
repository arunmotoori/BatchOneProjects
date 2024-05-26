package filehandling;

import java.io.File;
import java.io.IOException;

public class CheckingExistanceOfFiles {

	public static void main(String[] args) throws IOException {
		
		File file = new File("QAFox.txt");
		
		if(file.exists()) {
			
			System.out.println("File already exists. Hence not created.");
			

		}else {
			
			file.createNewFile();
			System.out.println("File is not available. Hence created.");
			
		}
		
		System.out.println("End of this program.");
		
		File file2 = new File("Arun.txt");
		
		if(file2.exists()) {
			
			System.out.println("File already exists. Hence not created.");
			

		}else {
			
			file2.createNewFile();
			System.out.println("File is not available. Hence created.");
			
		}
		
		System.out.println("End of this program.");
		

	}

}
