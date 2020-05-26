package oops2;

public class Mercedes implements Car{
	
	boolean isWindowLocked() {
		return false;
	}
	void powerWindow() {
		if(!isWindowLocked()) System.out.println("Window access through buttons...");
	}
	
	void automaticGears() {
		System.out.println("Gears will be shifted automatically...");
	}

	@Override
	public void window() {
		powerWindow();
	}

	@Override
	public void gears() {
		automaticGears();
	}
	
}
