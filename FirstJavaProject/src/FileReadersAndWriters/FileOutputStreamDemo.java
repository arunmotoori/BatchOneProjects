package FileReadersAndWriters;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		File xyzFile = new File("xyz.txt");
		
		FileOutputStream fos = new FileOutputStream(xyzFile);
		
		String textToBeWritten = "My name is Arun Motoori.\nI love Java Programming.\nI create content on Software Testing and Tools.";
		
		fos.write(textToBeWritten.getBytes());
		
		fos.flush();
		
		fos.close();
		
		System.out.println("End of this program.");

	}

}
