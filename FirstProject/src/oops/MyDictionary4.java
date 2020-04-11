package oops;

import java.util.ArrayList;
import java.util.HashMap;

class Student4{
	
	byte enrollment_no;
	String name;
	byte classLevel;
	String fatherName;
	String address;
	long contact;
	HashMap<String, Integer> subjectsWiseMarks = new HashMap<>();
	
}

public class MyDictionary4 {

	public static void main(String[] args) {
		
		Student4 obj1 = new Student4();
		obj1.enrollment_no = 1;
		obj1.name = "Ram";
		obj1.classLevel = 11;
		obj1.subjectsWiseMarks.put("English", 95);
		
		System.out.println("Student name : " + obj1.name);
		System.out.println("Marks in english " + obj1.subjectsWiseMarks.get("English"));
		
		HashMap<String, Long> phonebook = new HashMap<>();
		phonebook.put("Ram", 1002003001l);
		phonebook.put("Shyam", 1234567890l);
		phonebook.put("Mohan", 1234567891l);
		
		System.out.println(phonebook);
		
//		ArrayList<int[]> a = new ArrayList<>();
		
	}
	
}
