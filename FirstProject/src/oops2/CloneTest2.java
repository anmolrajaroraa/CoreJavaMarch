package oops2;

class Accessory implements Cloneable{
	int x;
	
	@Override
	protected Accessory clone() throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		return (Accessory)super.clone();
	}
}

class Cab implements Cloneable{
	
	int a;
	int b;
	Accessory accessory;
	
//	void doSomething() throws CloneNotSupportedException {
//		this.clone();
//	}
	
	@Override
	protected Cab clone() throws CloneNotSupportedException{
		Cab obj = (Cab) super.clone();
		obj.accessory = accessory.clone();
		return obj;
	}
	
}

class Driver{
	
	static void doSomething() throws CloneNotSupportedException {
//		Cab cab = new Cab();
//		cab.userid = 10;
//		cab.password = 20;
//		Cab cab2 = (Cab)cab.clone();
//		
//		System.out.println(cab2.userid);
//		System.out.println(cab2.password);
	}
	
	static void testShallowCloning() throws CloneNotSupportedException {
		Cab cab = new Cab();
		cab.a = 10;
		cab.b = 20;
		cab.accessory = new Accessory();
		cab.accessory.x = 30;
		
		Cab cab2 = (Cab)cab.clone();
		cab2.a = 100;
		cab2.b = 200;
		cab2.accessory.x = 300;
		
		System.out.println("Cab1 - " + cab.a + " " + cab.b + " " + cab.accessory.x);
		System.out.println("Cab2 - " + cab2.a + " " + cab2.b + " " + cab2.accessory.x);
		
	}
	
}

public class CloneTest2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Cab car = new Cab();
//		Cab car2 = car;
		
//		car.a = 10;
//		car.b = 20;
		
//		Driver.doSomething();
		Driver.testShallowCloning();
		
	}

}
