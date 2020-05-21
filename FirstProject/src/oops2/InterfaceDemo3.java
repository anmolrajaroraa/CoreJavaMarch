package oops2;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// abstract class vs interface
// abstract class is not 100% abstract
// but interface is 100% abstract (till java 7)
// from jdk 8 interface can have methods with bodies (non-abstract)
// interface contains only abstract methods and constants
// abstract class may or may not have abstract methods, constants, variables, constructors
// interface is implemented in a class, not extended
// abstract class is extended in child class so it has got a constructor chain
// interface doesn't need any constructor because it has got static values and abstract fns
// static things are loaded and initialised during class/interface load so no cons needed for them
// abstract class here is acting like the most generic class (common generic logic)
// abstract class has common features so it can only be inherited by child
// Account, CommonLoan, CommonPlayer - how to do
// Interface acts like a standard / prototype / model - what to do
// all classes implementing the standard needs to write the logic on how to do things
// abstract class implementing the standard can write common logic for some generic method
// problem with interface is that is too strict - class implementing needs to override all the methods
// you cannot create object of interface but you can use it for upcasting
// you can inherit only one class but you can implement many interfaces

// what to do
// every fn in interface is public abstract
// every value in interface is final static 

interface StarPlayer{
	void hide();
	void fly();
	void punch();
	int MAX_POWER = 50;
}

interface Player{
	final static int MAX_POWER = 100;
	int MIN_POWER = 10;
	public abstract void kick();
	void punch();
	void attack();
	void defense();
	void entry();
	void startPower();
}

// Mulltiple inheritance is allowed in Java But only in the case of 

interface HybridPlayer extends Player, StarPlayer{
	
}

abstract class CommonPlayer implements Player{
	public void entry() {
		System.out.println("Player will enter walking in some style ");
	}
	public void startPower() {
		System.out.println("Starting health will be 100 for each player");
	}
	public void kick() {
		System.out.println("Low kick");
	}
}

class Ryu extends CommonPlayer{

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
}
class Honda extends CommonPlayer{

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
}

class MyWindow extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Show confirmation popup");
	}
	
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		
//		WindowListener
//		KeyListener
//		MouseListener
//		MouseMotionListener
		
		WindowAdapter
		
		Ryu ryu = new Ryu();
		Player player = new Honda();

	}

}
