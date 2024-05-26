package filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFilesDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("QAFox.txt");
		file.createNewFile();

	}

}
