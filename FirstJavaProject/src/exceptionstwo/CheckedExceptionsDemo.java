package exceptionstwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("abc.txt");
		
		/*
		try {
			FileReader fr = new FileReader(file);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}*/
			
		
		FileReader fr = new FileReader(file);
		
		System.out.println("End of this program");

	}

}
