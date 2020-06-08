
interface X{
	void show(int x);
	default void display() {
		
	}
}

// eager classes
class Y implements X{
	public Y() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void show(int x) {
		System.out.println("Show call...");
	}
}

class T{
	class T1{
		
	}
}

public class InterfaceUse {

	public static void main(String[] args) {
		
		int speed = (int) ( Math.random() * 5 );
		System.out.println( speed == 0 ? 5 : speed);
		
		// During object creation we created a class 
		// lazy classes
		X x2 = new X() {

			@Override
			public void show(int x) {
				System.out.println("Anonymous class show fn call...");
				
			}

			
			public void display() {
				// TODO Auto-generated method stub
				
			}
			
		};
		x2.show(900);
		
		X x3 = new X() {

			@Override
			public void show(int x) {
				System.out.println("Anonymous class show fn call...");
				
			}

			
			public void display() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		// functional interface -> an interface that has only one abstract method
		// SAM interface -> interface having Single abstract method (can have any number of default methods)
		
		X x4 = (y) -> System.out.println("I am Lambda expression...");
		x4.show(900);
		
		X x5 = (int y) -> { 
			System.out.println("I am Lambda expression...");
			System.out.println("Another line in lambda");
		};
		x5.show(900);
		
		Y obj = new Y();
		obj.show(900);

		// anonymous class
//		X x2 = new X() {
//
//			@Override
//			public void show(int x) {
//				System.out.println("Show call...");
//			}
//			
//		};
		
	}

}
