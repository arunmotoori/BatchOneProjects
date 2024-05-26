package filehandling;

import java.io.File;

public class CheckingIsFileOrDirector {

	public static void main(String[] args) {
		
		File file = new File("QAFox.txt");
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		File file2 = new File("QAFox");
		System.out.println(file2.isFile());
		System.out.println(file2.isDirectory());
		
		

	}

}
