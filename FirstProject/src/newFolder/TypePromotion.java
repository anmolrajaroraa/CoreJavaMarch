package newFolder;

public class TypePromotion {
	
//	void add() {
//		System.out.println(0);
//	}
//	
//	void add(int a) {
//		System.out.println(a + 10);
//	}
//	
//	void add(int a, int b) {
//		System.out.println(a + b);
//	}
//	
//	void add(int a, int b, int c) {
//		System.out.println(a + b +c);
//	}
//	
//	void add(int a, int b, int c, int d) {
//		System.out.println(a + b + c + d);
//	}
	
//	void add(int ...x) {
//		int sum = 0;
//		for(int element : x) {
//			sum += element;
//		}
//		System.out.println(sum);
//	}
	
	// Overloading -> name should be same (number of args and their types can change)
	// If two fns have same arguments list then they cannot have separate return types and they are not treated as overloaded fns
	// Return type can be changed if args list is different then while calling java is able to detect different fns so these fns can be treated as overloaded fns
	
	// Type Promotion
	// 0. Default - int (primitive)
	// 1. Widening - bigger data type - long
	// 2. Wrapper class
	// 3. Varargs
	// 4. Won't go towards smaller types (explicit type casting required)
	
	
	void testTypePromotion(int x) {
		System.out.println("int");
	}
	void testTypePromotion(Integer x) {
		System.out.println("Integer");
	}
	void testTypePromotion(int ...x) {
		System.out.println("...int");
	}
	void testTypePromotion(long x) {
		System.out.println("long");
	}
	void testTypePromotion(byte x) {
		System.out.println("byte");
	}
	void testTypePromotion(short x) {
		System.out.println("short");
	}

	public static void main(String[] args) {
		
		// ... -> varargs -> variable arguments -> internally it's an array only
		
		TypePromotion obj = new TypePromotion();
		obj.testTypePromotion(10);
//		obj.testTypePromotion(Integer.valueOf(10)); // autoboxing
		
//		byte a = 100000;
		
//		obj.add(10, 20);
//		obj.add(10);
//		obj.add();
//		obj.add(10,20,30);
//		obj.add(10,20,30,40);
//		obj.add(10,20,30,40,50);

	}

}
