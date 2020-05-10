package oops2;

abstract class Account{
	
	long accountNo;
	String customerName;
	
	void withdraw() {
		System.out.println("Account Withdraw...");
		System.out.println("Verify pin...");
	}
	void deposit() {
		System.out.println("Account deposit...");
	}
	abstract void ROI();
//	void ROI() {
//		System.out.println("Common ROI...");
//	}
	abstract void someFn();
}
// abstract class doesnt say that you have to create abstract methods, its our choice
// but if you are creating even a single abstract method in a class then it is
// compulsory to define your class as abstract

// abstract keyword with class says you cannot create an object of this class from outside
// but child class can talk to the constructor of parent class thereby not stopping the inheritance
// use abstract class by inheriting it and then  instantiating the child class

// abstract keyword with method says this method is compulsory to be created by the child class
// in short overridden (body is to be created by child) but signature (params list, return type)
// should be same as defined by parent
// overriding can only be done after inheritance

// Same method can be used
// Overriding can be done
// Polymorphism can be done

//

class SavingsAccount extends Account{
	
	@Override
	void ROI() {
		SavingsAccount acc = new SavingsAccount();
		System.out.println("4% ROI will be given");
	}
	void ROI(int rate) {
		System.out.println("4% ROI will be given");
	}
	void limit() {
		System.out.println("Limit exceeded...");
	}
	void showPAN() {
		System.out.println("Show PAN card please...");
	}
	@Override
	void someFn() {
		// TODO Auto-generated method stub
		
	}
}

class CurrentAccount extends Account{
	void ROI() {
		System.out.println("8% ROI has to be paid");
	}

	@Override
	void someFn() {
		// TODO Auto-generated method stub
		
	}
}
class DematAccount extends Account{

	@Override
	void ROI() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void someFn() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class IsADemo {
	public static void main(String[] args) {
//		Account account = new Account();
//		account.deposit();
//		account.withdraw();
		
		SavingsAccount sa = new SavingsAccount();
		sa.deposit();
		sa.ROI();
//		sa.ROI(5);
//		sa.SAROI();
		sa.withdraw();
		sa.limit();
		sa.showPAN();
		
		CurrentAccount ca = new CurrentAccount();
		ca.deposit();
		ca.ROI();
		ca.withdraw();
	}
	MathOperations obj = new MathOperations();
}

final class MathOperations{
	void sqrt() {
		
	}
	void cubeRoot() {
		
	}
	void roots() {
		
	}
	void sin() {
		
	}
}

//class MuchBetterMathOperations extends MathOperations{
//	
//}


// no object from outside no inheritance -> private cons
// no object but inheritance allowed -> abstract class 
// no inheritance but object creation allowed from anywhere -> final