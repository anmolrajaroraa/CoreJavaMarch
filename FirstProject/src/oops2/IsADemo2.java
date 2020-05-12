package oops2;

class EmployeeDetails{
	String department;
	String managerName;
	String projectName;
	int floor;
}
class EmployeeDetailsPlus extends EmployeeDetails{
	int incentives;
}
class A{
	int a;
	EmployeeDetails getDetails() {
		EmployeeDetails details = new EmployeeDetails();
		details.department = "IT";
		details.managerName = "Ram Kumar";
		details.projectName = "NewProject";
		details.floor = 9;
		return details;
	}
}
class B extends A{
	int b;
	EmployeeDetailsPlus getDetails() {
		EmployeeDetailsPlus details = new EmployeeDetailsPlus();
		details.department = "IT";
		details.managerName = "Ram Kumar";
		details.projectName = "NewProject";
		details.floor = 9;
		details.incentives = 10000;
		return details;
	}
}

public class IsADemo2 {

	public static void main(String[] args) {
		
		

	}

}

// 2 thumb rules for overriding

// 1. Signature should be same11 - but we can change the return type if it is covariant
// 2. Weaker access rule
// 
// Private
// Protected
// Default
// Public
