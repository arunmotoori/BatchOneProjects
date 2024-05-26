package filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFilesAtFolderLocation {

	public static void main(String[] args) throws IOException {
		
		File folder1 = new File("QAFox");
		
		File file1 = new File(folder1,"Motoori.txt");

		file1.createNewFile();
		
		File file2 = new File("QAFox","Arun.txt");
		
		file2.createNewFile();
		
		
	}

}
