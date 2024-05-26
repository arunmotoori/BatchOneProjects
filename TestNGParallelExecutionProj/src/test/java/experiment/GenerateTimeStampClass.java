package experiment;

import java.util.Date;

public class GenerateTimeStampClass {

	public static void main(String[] args) {
		
		Date date = new Date();
	
		String dateText = date.toString();
		String dateText2 = dateText.replace(" ","_");
		String dateText3 = dateText2.replace(":","_");
		String email = "arun_"+dateText3+"@gmail.com";
		System.out.println(email);

	}

}
