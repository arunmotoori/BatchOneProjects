package filehandling;

import java.io.File;

public class CreatingFoldersDemo {

	public static void main(String[] args) {
		
		File file = new File("Demo");
		file.mkdir();

	}

}
