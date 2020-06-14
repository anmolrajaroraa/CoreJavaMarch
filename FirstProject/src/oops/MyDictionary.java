package oops;

class Student2{
	byte enrollment_no;
	String name;
	byte classLevel;
	byte englishMarks;
	byte physicsMarks;
	byte chemistryMarks;
	byte mathsMarks;
	byte computerScienceMarks;
	byte engineeringDrawingMarks;
	byte frenchMarks;
	byte accountacyMarks;
	byte businessStudiesMarks;
//	byte marks[];
}

public class MyDictionary {

	public static void main(String[] args) {
		
		Student2 obj1 = new Student2();
		obj1.enrollment_no = 1;
		obj1.name = "Ram";
		obj1.classLevel = 11;
		obj1.englishMarks = 95;
//		obj1.marks = new byte[5];
//		obj1.marks[0] = 50;
//		obj1.marks[1] = 60;
//		obj1.marks[2] = 70;
//		obj1.marks[3] = 80;
//		obj1.marks[4] = 90;
		
		System.out.println("Student name : " + obj1.name);
		System.out.println("Marks in english " + obj1.englishMarks);
//		for(int i = 0; i < obj1.marks.length; i++) {
//			System.out.println(obj1.marks[i]);
//		}
		
	}

}
