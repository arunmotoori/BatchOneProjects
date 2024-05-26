package privateagain;

public class Computer {
	
	private String model;
	private int noOfProcessors;
	
	private void startComputer() {
		
		System.out.println("Computer started");
		
	}
	
	private void stopComputer() {
		
		System.out.println("Computer stopped");
		
	}
	
	public void setModel(String model) {
		
		this.model = model;
		
	}
	
	public void setNoOfProcessors(int noOfProcessors) {
		
		this.noOfProcessors = noOfProcessors;
		
	}
	
	public String getModel() {
		
		return model;
		
	}
	
	public int getNoOfProcessors() {
		
		return noOfProcessors;
		
	}
	
	public void callMethods() {
		
		startComputer();
		stopComputer();
		
	}
	
	
}
