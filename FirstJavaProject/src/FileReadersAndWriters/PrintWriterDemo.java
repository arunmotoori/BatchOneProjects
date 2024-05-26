package FileReadersAndWriters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		File abcFile = new File("abc.txt");
		
		PrintWriter pw = new PrintWriter(abcFile);
		
		/*
		pw.print("My name is Arun Motoori.");
		pw.print("I love Java programming");
		pw.print("I create content on Software Testing and Tools.");
		*/
		
		pw.println("My name is Arun Motoori.");
		pw.println("I love Java programming");
		pw.print("I create content on Software Testing and Tools.");
		
		pw.flush();
		
		pw.close();
		
		System.out.println("End of this program.");

	}

}
