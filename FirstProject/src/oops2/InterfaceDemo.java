package oops2;

// what to do
// interface is 100% abstract (Java 7)
interface AccountInterface{
	void deposit();
	void withdraw();
	void roi();
}

// how to do
class NewSavingsAccount implements AccountInterface{

	@Override
	public void deposit() {
		System.out.println("Deposit procedure");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}
	
}

class NewCurrentAccount implements AccountInterface{

	@Override
	public void deposit() {
		System.out.println("Deposit procedure");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}
	
}

class NewDematAccount implements AccountInterface{

	@Override
	public void deposit() {
		System.out.println("Deposit procedure");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
