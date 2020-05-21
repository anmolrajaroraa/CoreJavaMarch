package oops2;

abstract class A1{
	int x;
	A1(){
		x = 100;
		System.out.println("A1 Default cons");
	}
	A1(int x){
		this();
		this.x = x;
		System.out.println("A1 Param cons");
	}
	void print() {
		System.out.println("Parent print fn...");
	}
}
class A2 extends A1{
	int x = 2000;
	int y;
	// super() will call parent default constructor and it should be the first line if used
	// by default any cons of child will call default cons of parent
	// but if args are specified then param cons of the parent can be called but from the first line only
	// constructor chaining means calling constructors from within the constructors
	// which results in a call stack
	A2(){
		super(88);
		y = 200;
		y += x;
		System.out.println("A2 default cons " + y);
	}
	A2(int x){
//		super(3000);
		this();
		System.out.println(super.x + this.x + x);
		System.out.println("A2 param cons");
	}
	@Override
	void print() {
		super.print();
		System.out.println("Child print fn...");
	}
}

// whenever we create a cons the default cons created by java is killed

class X1{
	int x;
	X1(int x){
		this.x = x;
	}
}
class X2 extends X1{
	X2(int x){
		super(100);
		this.x = x;
	}
}

public class SuperVSThis {

	public static void main(String[] args) {
		
		X2 obj2 = new X2(10);
		
		A2 obj = new A2(99);
		obj.print();
//		obj.x;
		
//		A1 obj2 = new A1();
////		obj.x;

	}

}

// Why multiple inheritance is not supported by java ?
// 1. Ambiguity problem
// 2. Constructor chaining problem

/*
 * class A1{
 * 		A1(int x){
 * 			System.out.println("I am A1 Param Cons");
 * 		}
 * }
 * class B1 extends A1{
 * 		B1(int x){
 * 			System.out.println("I am B1 Param Cons");
 * 		}
 * }
 * class Test{
 * 		main(){
 * 			B1 obj = new B1(100);
 * 		}
 * }
 */