package oops;

import java.util.HashMap;

class Student4{
	
	static final String[] nonMedOptionalSubjects = {"PhD", "ED", "French", "Music", "AI"}; //-> 36 bytes
	static final String[] commerceOptionalSubjects = {"IP"}; //-> 4 bytes
	
//	100 students -> per student 0 bytes waste -> 0 bytes wasted -> 0 kb
//	class binding -> 40 bytes at the time of class loading
	
	byte enrollment_no;
	String name;
	byte classLevel;
	String fatherName;
	String address;
	long contact;
	String stream;
	HashMap<String, Double> subjectsWiseMarks = new HashMap<>();
//	"English" - 10
	
	public void printMarks() {
		if(stream.equals("non-med")) {
			System.out.println(subjectsWiseMarks);
			System.out.println("Marks in english is " + subjectsWiseMarks.get("English"));
			System.out.println("Marks in physics is " + subjectsWiseMarks.get("Physics"));
			System.out.println("Marks in chemistry is " + subjectsWiseMarks.get("Chemistry"));
			System.out.println("Marks in maths is " + subjectsWiseMarks.get("Maths"));
			System.out.println("Marks in computer science is " + subjectsWiseMarks.get("CS"));
			
			for(String subject : nonMedOptionalSubjects) {
				if(subjectsWiseMarks.get(subject) != null) {
					System.out.println("Marks in " + subject + " is " +  subjectsWiseMarks.get(subject));
				}
			}
			
//			if(subjectsWiseMarks.get("PhD") != null) {
//				System.out.println("Marks in physical education " + subjectsWiseMarks.get("PhD"));
//			}
//			if(subjectsWiseMarks.get("ED") != null) {
//				System.out.println("Marks in engineering drawing " + subjectsWiseMarks.get("ED"));
//			}
//			if(subjectsWiseMarks.get("French") != null) {
//				System.out.println("Marks in french " + subjectsWiseMarks.get("French"));
//			}
		}
		else if(stream.equals("commerce")) {
			for(String subject : commerceOptionalSubjects) {
				if(subjectsWiseMarks.get(subject) != null) {
					System.out.println("Marks in " + subject + " is " +  subjectsWiseMarks.get(subject));
				}
			}
		}
		else {
			System.out.println("Stream not available!!");
		}
	}
}

public class MyDictionary4 {

	public static void main(String[] args) {
		
		Student4 obj1 = new Student4();
		obj1.enrollment_no = 1;
		obj1.name = "Ram";
		obj1.classLevel = 11;
		obj1.stream = "non-med";
		obj1.subjectsWiseMarks.put("English", 85.0);
		obj1.subjectsWiseMarks.put("Physics", 75.5);
		obj1.subjectsWiseMarks.put("Chemistry", 65.0);
		obj1.subjectsWiseMarks.put("CS", 55.0);
		obj1.subjectsWiseMarks.put("Maths", 45.0);
		obj1.subjectsWiseMarks.put("PhD", 35.0);
		obj1.printMarks();
		System.out.println("Roll no -  " + obj1.enrollment_no);
		
//		System.out.println("Student name : " + obj1.name);
//		System.out.println("Marks in english " + obj1.subjectsWiseMarks.get("English"));
//		System.out.println(obj1.subjectsWiseMarks.get("Physical Education"));
		
		Student4 obj2 = new Student4();
		obj2.enrollment_no = 2;
		obj2.name = "Shyam";
		obj2.classLevel = 11;
		obj2.stream = "commerce";
		obj2.subjectsWiseMarks.put("Accounts", 95.5);
		
		HashMap<String, Long> phonebook = new HashMap<>();
		phonebook.put("Ram", 1002003001l);
		phonebook.put("Shyam", 1234567890l);
		phonebook.put("Mohan", 1234567891l);
		
		System.out.println(phonebook);
		
//		ArrayList<Integer> a = new ArrayList<>();
		
//		[10,20,30,40,50]
//				
//		English, Maths, Physics, Chemistry, Computer Science
//		
//		English, Maths, Physics, Chemistry, Engineering Drawing
//		
//		{"English" : 50, "Maths" : 30, "Physics" : 10, "Chemistry" : 20, "Engineering Drawing" : 40}
//		
	}
	
}
