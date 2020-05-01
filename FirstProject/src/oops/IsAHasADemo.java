package oops;

class A{
	
	B obj = new B();
	
}

class B{
	
	A obj = new A();
	
}

public class IsAHasADemo {

	public static void main(String[] args) {
		
		// Class Relationship - Is A (Inheritance), Has A (Embedding  objects)
		
		// Cyclic dependency - OOAD - Object Oriented Analysis and Design
		
		A newObj = new A();
		System.out.println(newObj);

	}

}

// class name should be noun always
// methods name should be action always

//B cons
//A cons
//B cons
//A cons
//B cons
//A cons
//B cons
//A cons
// B cons
// A cons
// B cons
//A cons
