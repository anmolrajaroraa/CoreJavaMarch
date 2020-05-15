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
class FreeLancer{
	String projectName;
	int incentives;
	int hoursPerWeek;
}
class A{
	int a;
	public Object getDetails() {
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
	public EmployeeDetailsPlus getDetails() {
		EmployeeDetailsPlus details = new EmployeeDetailsPlus();
		details.department = "IT";
		details.managerName = "Ram Kumar";
		details.projectName = "NewProject";
		details.floor = 9;
		details.incentives = 10000;
		return details;
	}
}
class C extends A{
	int c;
	public FreeLancer getDetails() {
		FreeLancer details = new FreeLancer();
		details.projectName = "NewProject";
		details.incentives = 10000;
		details.hoursPerWeek = 40;
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

// public abstract class ABC{

// int a,b,c;

// abstract void print(){
// }

// }

// class XYZ{

// int d,e;

//}