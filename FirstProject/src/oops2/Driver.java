package oops2;

public class Driver {

	public static void main(String[] args) {
//		
//		CarFactory cf = new  CarFactory();
//		cf.getCar();
		
		Car car = CarFactory.getCar();
		car.gears();
		car.window();
		
		Alto alto  = new Alto();
		Alto alto2 = alto;   // copy memory address
		Alto alto3 = alto.clone();
	}

}
