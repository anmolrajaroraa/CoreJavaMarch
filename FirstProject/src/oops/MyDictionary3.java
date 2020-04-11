package oops;

class Student3{
	byte enrollment_no;
	String name;
	byte classLevel;
	String fatherName;
	String address;
	long contact;
	Object obj; //upcasting
//	NonMedStream nonMed = new NonMedStream();
//	CommerceStream commerce = new CommerceStream();
}

class NonMedStream{
	byte englishMarks;
	byte physicsMarks;
	byte chemistryMarks;
	byte mathsMarks;
	byte computerScienceMarks;
	byte engineeringDrawingMarks;
	byte physicalEducationMarks;
}

class CommerceStream{
	byte accountancyMarks;
	byte microEconomicsMarks;
	byte macroEconomicsMarks;
	byte businessStudiesMarks;
	byte mathsMarks;
	byte physicalEducationMarks;
	byte informationPracticesMarks;
}

public class MyDictionary3 {

	public static void main(String[] args) {
		
		Student3 obj1 = new Student3();
		obj1.name = "Ram";
//		obj1.nonMed.physicsMarks = 80;
		
		Student3 obj2 = new Student3();
		obj2.name = "Ram";
//		obj2.commerce.accountancyMarks = 80;

	}

}
