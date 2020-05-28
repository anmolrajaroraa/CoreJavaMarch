package oops2;

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
//	void hide();
//	void fly();
	void punch();
	
	default public void hide() {
		System.out.println("You cant see me");
	}
	default public void fly() {
		System.out.println("Catch me if you can");
	}
	public static final int MAX_POWER = 50;
	int MIN_POWER = 5;
}

interface Player{
	int MAX_POWER_OF_STAR = StarPlayer.MAX_POWER;
	int MAX_POWER = 100;
	int MIN_POWER = 10;
	
	public static void showCharacteristics() {
		System.out.println(MAX_POWER_OF_STAR);
		System.out.println(MAX_POWER);
		System.out.println(MIN_POWER);
		System.out.println(StarPlayer.MIN_POWER);
	}
	
	public abstract void kick();
	void punch();
	void attack();
	void defense();
	default void entry() {
		System.out.println("Player will enter walking in some style ");
	}
	default public void startPower() {
		System.out.println("Starting health will be 100 for each player");
	}
}

// Mulltiple inheritance is allowed in Java But only in the case of 

interface HybridPlayer extends Player, StarPlayer{
//	int MAX_POWER = 40;
	default public void throwFire() {
		System.out.println("I can throw fire...");
	}
}

//abstract class SuperPlayer implements StarPlayer{
//	public void hide() {
//		System.out.println("You cant see me");
//	}
//	public void fly() {
//		System.out.println("Catch me if you can");
//	}
//}

//abstract class CommonPlayer implements Player{
//	static int a = 10;
//	public void entry() {
//		System.out.println("Player will enter walking in some style ");
//	}
//	public void startPower() {
//		System.out.println("Starting health will be 100 for each player");
//	}
//}

class Bison implements Player, StarPlayer{
	
	static int power;
	
	static void abc() {
		int power = 100;
	}

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

class Dhalsim implements HybridPlayer{

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

class Ryu implements Player{

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

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}
	
}
class Honda implements Player{

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

//class MyWindow extends WindowAdapter{
//	
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println("Show confirmation popup");
//	}
//	
//}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		
		Ryu ryu = new Ryu();  // implements only player
		ryu.attack();
		ryu.defense();
		ryu.entry();
		ryu.startPower();
		ryu.punch();
		ryu.kick();
		
		Bison bison = new Bison(); // implements player and starplayer
		bison.attack();
		bison.defense();
		bison.entry();
		bison.startPower();
		bison.punch();
		bison.kick();
		bison.fly();
		bison.hide();
		
		HybridPlayer dhalsim = new Dhalsim();  // implements hybrid player which in turn inherits player and star player
		dhalsim.attack();
		dhalsim.defense();
		dhalsim.entry();
		dhalsim.startPower();
		dhalsim.punch();
		dhalsim.kick();
		dhalsim.fly();
		dhalsim.hide();
		dhalsim.throwFire();
		System.out.println(StarPlayer.MAX_POWER);
		System.out.println(Player.MAX_POWER);
		System.out.println(Player.MAX_POWER);
		System.out.println(StarPlayer.MIN_POWER);
		
		Player.showCharacteristics();
		
		
		
		
		
		
		
		
////		WindowListener
////		KeyListener
////		MouseListener
////		MouseMotionListener
//		
////		WindowAdapter
//		
//		Ryu ryu = new Ryu();
////		ryu.a;
//		Player player = new Honda();

	}

}
