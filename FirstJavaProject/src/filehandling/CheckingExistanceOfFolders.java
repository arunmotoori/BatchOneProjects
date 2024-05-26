package filehandling;

import java.io.File;

public class CheckingExistanceOfFolders {

	public static void main(String[] args) {

		File folder1 = new File("Demo");
		
		if(folder1.exists()) {
			System.out.println("Folder already exists. Hence not created.");
		}else {
			folder1.mkdir();
			System.out.println("Folder is created.");
		}
		
		
		
		File folder2 = new File("QAFox");
		
		if(folder2.exists()) {
			System.out.println("Folder already exists. Hence not created.");
		}else {
			folder2.mkdir();
			System.out.println("Folder is created.");
		}
		
		System.out.println("End of this program");

	}

}
