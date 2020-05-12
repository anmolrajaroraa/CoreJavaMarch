package NewPackage;

import Package1.A;

//import Package1.A;

public class C extends A{
	
	public C() {
		// TODO Auto-generated constructor stub
		this.cheatCode = "Nothing";
	}
	
	public static void main(String[] args) {
		
		C obj = new C();
		String s = obj.cheatCode;
		obj.print();
		
	}
	
}
