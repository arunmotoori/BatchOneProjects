package classesobjects;

public class Demo {
	
	public static void main(String[] args) {
		
		Car hamz = new Car();
		
		hamz.company = "Honda";
		hamz.model = "Amaze";
		hamz.price = 9.5;
		hamz.milage = 14.12;
		hamz.color = "Grey";
		
		hamz.startCar();
		hamz.stopCar();
		hamz.carDetails();
		
		Car msvdi = new Car();
		
		msvdi.company = "Maruti";
		msvdi.model = "Swift VDI";
		msvdi.price = 8.3;
		msvdi.milage = 23.64;
		msvdi.color = "Red";
		
		msvdi.startCar();
		msvdi.stopCar();
		msvdi.carDetails();
		
		Car hyi20 = new Car();
		
		hyi20.company = "Hyundai";
		hyi20.model = "i20";
		hyi20.price = 12.8;
		hyi20.milage = 10.11;
		hyi20.color = "White";
		
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.carDetails();
		
		
	}

}
