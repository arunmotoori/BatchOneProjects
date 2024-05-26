package FileReadersAndWriters;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		File arunFile = new File("Arun.txt");
		
		FileReader fr = new FileReader(arunFile);
		
		/*
		int a = fr.read();
		System.out.println(a);
		int b = fr.read();
		System.out.println(b);
		*/
	
		int a = fr.read();
		
		while(a!=-1) {
			
			char c = (char)a;
			System.out.print(c);
			a = fr.read();
			
		}
		
		fr.close();
			
	}

}
