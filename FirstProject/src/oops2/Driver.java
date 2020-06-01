package oops2;

public class Driver extends Alto{

	
	public static void main(String[] args) throws CloneNotSupportedException {
//		
//		CarFactory cf = new  CarFactory();
//		cf.getCar();
		
		Driver driver = new Driver();
		driver.clone();
		
		Car car = CarFactory.getCar();
		car.gears();
		car.window();
		
		Object alto  = new Alto();
//		Alto alto2 = alto;   // copy memory address
		alto.clone();
		
		
	}

}

class CC extends BB{
	protected int c = a;
	public CC() {
		// TODO Auto-generated constructor stub
		abc();
	}
}
