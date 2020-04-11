package oops;

class NonMedStudent{
	byte enrollment_no;
	String name;
	byte classLevel;
	String fatherName;
	String address;
	long contact;
	byte englishMarks;
	byte physicsMarks;
	byte chemistryMarks;
	byte mathsMarks;
	byte computerScienceMarks;
	byte engineeringDrawingMarks;
	byte physicalEducationMarks;
}

class CommerceStudent{
	byte enrollment_no;
	String name;
	byte classLevel;
	String fatherName;
	String address;
	long contact;
	byte accountancyMarks;
	byte microEconomicsMarks;
	byte macroEconomicsMarks;
	byte businessStudiesMarks;
	byte mathsMarks;
	byte physicalEducationMarks;
	byte informationPracticesMarks;
}

public class MyDictionary2 {

	public static void main(String[] args) {
		
		NonMedStudent obj1 = new NonMedStudent();
		obj1.enrollment_no = 1;
		obj1.name = "Ram";
		obj1.classLevel = 11;
		obj1.physicsMarks = 85;
		
		System.out.println("Student name : " + obj1.name);
		System.out.println("Marks in Physics " + obj1.physicsMarks);
		
		CommerceStudent obj2 = new CommerceStudent();
		obj2.enrollment_no = 2;
		obj2.name = "Shyam";
		obj2.classLevel = 11;
		obj2.accountancyMarks = 85;
		
		System.out.println("Student name : " + obj2.name);
		System.out.println("Marks in Accounts " + obj2.accountancyMarks);

	}

}
