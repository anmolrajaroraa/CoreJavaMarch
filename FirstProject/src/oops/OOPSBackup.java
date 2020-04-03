//package com.ibm.xyz.Customer;

package oops;

import java.util.Scanner;

class MyStudent{
	int id ;
	String name;
	String courseName;
	int courseDuration;
	static Scanner scanner = new Scanner(System.in); 
	//scanner gets created only once when the class loads
	
	void showDetails() {
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
		System.out.println("Course name is " + courseName);
		System.out.println("Course duration is " + courseDuration);
//		System.out.println(scanner);
	}
	
	void takeInput(int student_id, String student_name, String course, int duration) {
		id = student_id;
		name = student_name;
		courseName = course;
		courseDuration = duration;
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
}

public class OOPSBackup {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		MyStudent obj1 = new MyStudent();
//		obj1.takeInput(101, "Ram", "Core java", 4);
		obj1.takeInputUsingScanner();
		obj1.showDetails();
		
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