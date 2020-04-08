//package com.ibm.xyz.Customer;

package oops;

import java.util.Scanner;

class MyStudent{
	
	private static final String COMPANY_NAME = "XYZ Pvt. Ltd.";
	
	private int id;
	private String name;
	private String courseName;
	private int courseDuration;
	private static Scanner scanner = new Scanner(System.in);  // class variable 
	static final int REG_FEES = 1000;
	
	
	// constants should have their names always in capital
	// final means value in this variable is constant, it cant be changed
	// scanner gets created only once when the class loads
	
	// getter
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	String getCourseName() {
		return courseName;
	}
	int getCourseDuration() {
		return courseDuration;
	}
	
	// setter
	
	void setName(String name) {
		this.name = name;
	}
	void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	void setCourseDuration(int courseDuration) {
		if(courseDuration > 0) {
			this.courseDuration = courseDuration;
		}
		else {
			System.out.println("courseDuration cannot be negative");
		}
	}
	
	
	void showDetails() {
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
		System.out.println("Course name is " + courseName);
		System.out.println("Course duration is " + courseDuration);
//		System.out.println(scanner);
	}
	
	void takeInput(int id, String student_name, String course, int duration) {
		this.id = id; // here id is local variable
		// this.id -> instance (object) variable
		name = student_name;
		courseName = course;
		courseDuration = duration;
	}
	
	void takeInput2(int id, String name, String courseName, int courseDuration){
		if(id > 0 && courseDuration > 0) {
			this.id = id; //this keyword always points to the current owner (caller) of the fn
			this.name = name;
			this.courseName = courseName;
			this.courseDuration = courseDuration;
		}
		else {
			System.out.println("ID / courseDuration cannot be negative");
		}
	}
	
	void takeInputUsingScanner() {
		System.out.println("Enter student id : ");
		id = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter student name : ");
		name = scanner.nextLine();
		System.out.println("Enter course name : ");
		courseName = scanner.nextLine();
		System.out.println("Enter course duration : ");
		courseDuration = scanner.nextInt();
	}
	private static final int DISCOUNT = 10;
}

public class OOPSBackup {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Registration fees is " + MyStudent.REG_FEES);
		
		MyStudent obj1 = new MyStudent();
//		obj1.takeInput(101, "Ram", "Core java", 4);
//		obj1.takeInputUsingScanner();
		obj1.takeInput2(101, "Ram", "Core Java", 4);
		obj1.setName("Ram Kumar");
		obj1.setCourseDuration(6);
		
//		obj1.id = 101;
		obj1.showDetails();
//		System.out.println(obj1.id);
		
		
		
		System.out.println("Ram's id is " + obj1.getId());
//		int x = obj1.REG_FEES;
		
//		int id = 100;
//		System.out.println(id);
//		System.out.println(obj1.id);
		
//		obj1.id = 101;
//		obj1.name = "Ram";
//		obj1.courseName = "Core Java";
//		obj1.courseDuration = 4;
//		obj1.id = scanner.nextInt();
//		obj1.name = scanner.nextLine();
//		obj1.courseName = scanner.nextLine();
//		obj1.courseDuration = scanner.nextInt();
		
//		System.out.println(obj1);
		
//		System.out.println(obj1.sid);
//		System.out.println(obj1.name);
//		System.out.println(obj1.course);
//		System.out.println(obj1.duration);
		
		MyStudent obj2 = new MyStudent();
		obj2.takeInput(102, "Shyam", "Advance Java", 4);
		obj2.showDetails();
		
//		obj2.id = 102;
//		obj2.name = "Shyam";
//		obj2.courseName = "Advance Java";
//		obj2.courseDuration = 4;
		
//		System.out.println(obj2);
		
//		System.out.println(obj2.sid);
//		System.out.println(obj2.name);
//		System.out.println(obj2.course);
//		System.out.println(obj2.duration);
		
		
//		String s = "Ram";
//		s = null;
//		int arr[][] = new int[5][];
//		System.out.println(arr);
//		arr[0] = new int[10];
//		System.out.println(arr[0][0]);
//		System.out.println(s.toString());

	}

}

// Unit testing (JUnit)

//DRY principle
// (Do Not Repeat Yourself)


//scope -> modules, access modifiers, class

// class has got a scope

// class name should always be a noun / entity name
// function name should always be an action / verb

// class name should always be in title case
// fn name should always be in camel case

//class Customer{
////add customer
//void add(){
//	
//}
//void addDetails() {
//	
//}
//}

class CarLoan{
int roi = 10;
//add car loan
void add(){
	
}
}

class Homeloan{
int roi = 9;
//add home loan
void add(){
	
}
}

class Account{
//add account
void add(){
	
}
}

class Customer{
	void create() {
		
	}
	void Details() {
		
	}
	void changeDetails() {
		
	}
	void deleteCustomer() {
		
	}
}

//CreateCustomer obj = new CreateCustomer();
//obj.delete

//Customer.create()