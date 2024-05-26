package FileReadersAndWriters;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File qafox = new File("QAFox.txt");
		
		FileWriter fw = new FileWriter(qafox);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("My name is Arun Motoori.");
		bw.newLine();
		bw.write("I love Java Programming.");
		bw.newLine();
		bw.write("I love creating content on Software Testing and Tools.");
		
		bw.flush();
		
		bw.close();
		
		System.out.println("End of this program.");
	}

}
