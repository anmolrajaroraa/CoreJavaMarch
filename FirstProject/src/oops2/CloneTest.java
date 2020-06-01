package oops2;

class Cars{
	
	int a;
	int b;
	
	Cars cloneCar() {
		Cars obj = new Cars();
		obj.a = this.a;
		obj.b = this.b;
		return obj;
	}
	
}

public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cars car = new Cars();
//		Cars car2 = car;
		
		car.a = 10;
		car.b = 20;
		
		Cars car3 = car.cloneCar();
		System.out.println(car3.a);
		System.out.println(car3.b);
		
	}

}
