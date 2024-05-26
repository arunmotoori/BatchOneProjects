package filehandling;

import java.io.File;

public class DeletingFilesFolders {

	public static void main(String[] args) {
		
		File file1 = new File("abc.txt");

		if(file1.exists()) {
			
			file1.delete();
			
		}
		
		File folder1 = new File("Demo");
		
		if(folder1.exists()) {
			
			folder1.delete();
			
		}
		
		File folder2 = new File("sample");
	
		if(folder2.exists()) {
			
			boolean b = folder2.delete();
			System.out.println(b);
			//Empty folder can be deleted.
			//Files in the folder needs to be deleted first, before deleting the folder.
			
		}
		
		System.out.println("End of this program.");
	}

}
