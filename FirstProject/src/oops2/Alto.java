package oops2;

public class Alto extends Object implements Car, Cloneable{
	
	int a = 100;

	void manualWindow() {
		System.out.println("Window open through lever...");
	}
	void manualGears(int noOfGears) {
		System.out.println("Manually change gears " + noOfGears);
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	@Override
	public void window() {
		manualWindow();
	}
	@Override
	public void gears() {
		manualGears(6);
	}
	
}
