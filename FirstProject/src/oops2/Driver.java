package oops2;

public class Driver {

	public static void main(String[] args) {
		
		Car car = CarFactory.getCar();
		car.gears();
		car.window();
	}

}
