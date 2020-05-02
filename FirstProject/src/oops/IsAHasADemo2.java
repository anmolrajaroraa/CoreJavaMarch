package oops;

class Bank{
	String bank_name;
	String bank_type; // -> 10 bytes -> bytes
}

class Account2 extends Bank{
	int account_no; // -> 4 bytes
	String customer_name; // ->10 bytes
	int balance; // -> 4 bytes
}

class SavingsAccount extends Account2{
	int roi; // -> 4 bytes = 42 bytes for sa object
}

// embedding of objects
class Customer2{
	Bank obj;
	Account2 acc;
	SavingsAccount sa;
}

public class IsAHasADemo2 {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount();
		sa.account_no = 101;
		
		// Whenever you define a class it always inherit some other class
		// Either it will inherit some class you built or
		// By default it inherits Object class
		
		// Benefits of IS A (inheritance)
		// 1. Reusability
		// 2. Polymorphism
		
		// Only extend some class when needed otherwise objects will be heavier

	}

}
