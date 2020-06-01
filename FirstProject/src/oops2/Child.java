package oops2;

import oops.Dad;

public class Child extends Dad{

	void doSomething() {
		luxuryCar();
	}
	
	@Override
	protected void luxuryCar() {
		// TODO Auto-generated method stub
		super.luxuryCar();
	}
	
}

class Friend extends Child{
	
	void doSomething() {
		
		Child child = new Child();
		child.luxuryCar();        // not visible because not in same apckage
		
	}
	
}