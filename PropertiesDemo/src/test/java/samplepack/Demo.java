package samplepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		File propFile = new File("src/test/java/propertiespack/ProjectData.properties");
		FileInputStream fis = new FileInputStream(propFile);
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("firstname"));
		System.out.println(prop.getProperty("lastname"));
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("telephone"));
		System.out.println(prop.getProperty("location"));
		System.out.println(prop.getProperty("experience"));
		
	}

}
