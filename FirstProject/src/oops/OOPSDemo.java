package oops;

// custom data type
class Student{
	int sid;
	String name;
	String course;
	int duration;
	
	void showDetails() {
		System.out.println("Id is " + sid);
		System.out.println("Name is " + name);
		System.out.println("Course is " + course);
		System.out.println("Duration is " + duration);
	}
}

public class OOPSDemo {

	public static void main(String[] args) {
		
		Student Ram = new Student(); // compile time assignment
		// Ram is a reference variable that can point only to a Student object
		// Ram stores memory location (address) of object
		// Ram -> &77;
		Ram.sid = 101;
//		&77.id = 101;
		Ram.name = "Ram Kumar";
		Ram.course = "Core Java";
		Ram.duration = 3;
//		System.out.println(Ram);
//		System.out.println(Ram.sid);
//		System.out.println(Ram.name);
//		System.out.println(Ram.course);
//		System.out.println(Ram.duration);
		Ram.showDetails();
		
		Student Shyam = new Student();
		Shyam.sid = 102;
		Shyam.name = "Shyam Kumar";
		Shyam.course = "Advance Java";
		Shyam.duration = 3;
//		System.out.println(Shyam);
//		System.out.println(Shyam.sid);
//		System.out.println(Shyam.name);
//		System.out.println(Shyam.course);
//		System.out.println(Shyam.duration);
		Shyam.showDetails();
		
		String s = "Ram";
		s.length();
		s.toUpperCase();
		s.toCharArray();
		
		//Abstraction (hiding details) of things
		//Pointers are hidden because of security reason
		//File handling is easy
		
//		100,00,00,000
//		7.5,00,00,000
//		25,00,00,000
		
	}

}

// Unit testing (stub) -> JUnit (white box testing)
// Automation Testing -> Selenium (black box testing)

// 4th gen languages -> Java / C++
// 5th gen languages -> Ruby, Python (English-like syntax)
// Advance Java -> J2EE (Java EE)
// Spring, Hibernate, JPA, web services, microservices
// User Interface - UI (HTML5, CSS3, JavaScript, jQuery, Bootstrap)


//In C, 
//function a, b, c, d -> File1.java
//function a, b, c, d -> File2.java
//
//function addLoan()
//
//class SavingsAccount{
//	function addAccount()
//	function withdrawal()
//	function checkPIN()
//}
//class CurrentAccount{
//	function addAccount()
//}
//
//CurrentAccount ca = new CurrentAccount();
//ca.addAccount()
//function addNewSavingsAccount()

//Everything is global in C

// class name should always be noun / entity 
// function name should always be action or verb
// class is a category
// object is a product of that category
// class does not uses any physical memory
// object consumes some physical memory 
// class has features (blueprint)
// object has got state


//class Electronics{
//	String brandName;
//	String model_name;
//	int price;
//	
//	addProduct()
//	deleteProduct()
//	viewProduct()
//}
//
//Electronics miSmartTv = new Electronics();
//miSmartTv.model_name = "A40X";
//
//Electronics vivoV17 = new Electronics()