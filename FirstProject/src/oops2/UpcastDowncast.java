package oops2;

abstract class Shape{
	int counter = 10;
	static void getAvailableActions(){
		System.out.println("draw rotate area perimeter");
	}
	static void getAvailableActions(String shapeName) {
		if(shapeName.equals("circle"))
			System.out.println("draw rotate area perimeter calculateDiameter");
		else
			System.out.println("draw rotate area perimeter calculateDiagnol");
	}
	void draw() {
		System.out.println("Shape draw..");
	}
	void rotate() {
		System.out.println("Shape rotate..");
	}
	void area() {
		System.out.println("Shape area..");
	}
	void perimeter() {
		System.out.println("Shape perimeter..");
	}
}

class Circle extends Shape{
	int counter = 100;
	
	// static methods cannot be overridden because they are not binded with objects at runtime
	// static methods can be overloaded
	
	static void getAvailableActions() {
		System.out.println("draw rotate area perimeter calculateDiameter");
	}
	void draw() {
		System.out.println("Circle draw using radius");
	}
	void area() {
		System.out.println("Area using PI * r * r");
	}
	void perimeter() {
		System.out.println("Perimeter using 2 * PI * r");
	}
	void calculateDiameter() {
		System.out.println("Diameter = 2 * r");
	}
}

class Rectangle extends Shape{
	int counter = 1000;
	void draw() {
		System.out.println("Rectangle draw using length and breadth");
	}
	void area() {
		System.out.println("Area using l * b");
	}
	void perimeter() {
		System.out.println("Perimeter using 2 * (l + b) ");
	}
	void calculateDiagnol() {
		System.out.println("Diagnol using pythagoras");
	}
}

class Square extends Shape{
	int counter = 10000;
	void draw() {
		System.out.println("Square draw using same side");
	}
	void area() {
		System.out.println("Area using s * s");
	}
	void perimeter() {
		System.out.println("Perimeter using 4 * s");
	}
	void calculateDiagnol() {
		System.out.println("Diagnol using pythagoras");
	}
}

public class UpcastDowncast {
	
	static void test(Shape shape) {
		shape.area();
		shape.draw();
		shape.perimeter();
		shape.rotate();  // always overridden functions are called (child versions)
		System.out.println(shape.counter);  // variables are accessed from the current casted class
		if(shape instanceof Circle) {
			Circle circle = (Circle)shape;
			circle.calculateDiameter();
			System.out.println(circle.counter);
		}
		else if(shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle)shape;
			rectangle.calculateDiagnol();
			System.out.println(rectangle.counter);
		}
		else if(shape instanceof Square){
			Square square = (Square)shape;
			square.calculateDiagnol();
			System.out.println(square.counter);
		}
	}

	public static void main(String[] args) {
		
//		Shape shape = new Circle(); //upcasting
		// creating object of child class and then casting it into parent class
		// upcasting means converting the object into parent type and blocking the specific methods
		// but the commons are still open for use
		// but if these common fns are executed then the overridden fns will be used, not the parent one
//		shape.draw();
//		shape.area();
//		shape.perimeter();
//		shape.rotate();
//		Circle circle = (Circle)shape; //downcasting
//		circle.calculateDiameter();
		
		test(new Circle());
		test(new Rectangle());
		test(new Square());
//		int a = (int)"ten";
		
		Shape.getAvailableActions();
		Circle.getAvailableActions();
		
//		Circle circle = new Circle();
//		circle.area();
//		circle.draw();
//		circle.perimeter();
//		circle.rotate();
//		circle.calculateDiameter();
//		
//		Rectangle rectangle = new Rectangle();
//		rectangle.area();
//		rectangle.draw();
//		rectangle.perimeter();
//		rectangle.rotate();
//		
//		Square square = new Square();
//		square.area();
//		square.draw();
//		square.perimeter();
//		square.rotate();
		
	}

}
