package oops2;

class W{
	int a = 1;
}
class X extends W{
	int a = 10;
	int b = super.a;
}
class Y extends X{
	int a = 20;
	int b = super.b;
}
class Z extends Y{
	int a = 30;
	Z(int a){
		System.out.println(a + this.a + super.a + ((X)this).a + ((W)this).a);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Z obj = new Z(40);
//		X obj2 = obj;  upcasting
		
		X obj2 = (X)new Z(100);  // up
		Z obj3 = (Z)obj2;   // down
		
	}

}
