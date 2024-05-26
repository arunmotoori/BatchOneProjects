package FileReadersAndWriters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File arunFile = new File("Arun.txt");
		
		FileWriter fw = new FileWriter(arunFile);
		
		fw.write("My name is Arun Motoori.\n");
		fw.write("I love Java programming.\n");
		fw.write("I love creating content on Software Testing and Tools.");
		
		fw.flush();
		
		fw.close();
		
		System.out.println("End of this program.");

	}

}
