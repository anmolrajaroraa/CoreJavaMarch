package oops2;

public class Alto implements Car{

	void manualWindow() {
		System.out.println("Window open through lever...");
	}
	void manualGears(int noOfGears) {
		System.out.println("Manually change gears " + noOfGears);
	}
	protected Alto clone() {
		return this.clone();
	}
	
	
	
	@Override
	public void window() {
		manualWindow();
	}
	@Override
	public void gears() {
		manualGears(6);
	}
	
}
