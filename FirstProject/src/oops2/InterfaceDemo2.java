package oops2;

// What to do
// Not how to do - it is told by classes
// interface is like a skeleton - declarations of functions
// each fn defined in interface is by default abstract and public
interface Loan {
	public abstract void roi();
	public abstract void emi();
	void approve();
}
// definition for functions
abstract class CommonLoan implements Loan{
	 public void approve() {
		System.out.println("Approve the loan");
	 }
}
class HomeLoan extends CommonLoan{
	@Override
	public void roi() {
		System.out.println("10% interest");
	}
	@Override
	public void emi() {
		System.out.println("10 years tenure");
	}	
}
class AutoLoan extends CommonLoan{

	@Override
	public void roi() {
		System.out.println("12% interest");
	}

	@Override
	public void emi() {
		System.out.println("5 years tenure");	
	}
	
}

public class InterfaceDemo2 {

	public static void main(String[] args) {

	}

}
