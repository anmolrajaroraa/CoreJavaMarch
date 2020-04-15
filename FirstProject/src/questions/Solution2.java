package questions;

class EmployeeSalarySlip {
	// pool object is consuming 26 bytes (single object) // 8 byte in every object
	// static is used so that companyName variable is only created once at the time
	// of class loading and not created in every object
	// because companyName is string, so it's object will be created only once in
	// the pool
	// private is used because I want to block get and set actions for companyName
	// variable
	// final can also be used to block only set action (makes variable constant)
	// private static String companyName = "XYZ Pvt. Ltd.";
	static final String COMPANY_NAME = "XYZ Pvt. Ltd.";
	private short employee_id;
	private String name;
	private String designation;
	private byte month;
	private byte year;
	private int basicSalary;
	private boolean loanTaken;
	private int HRA;
	private int DA;
	private int TA;
	private int MA;
	private int PF;
	private int EMI; // by default, 0 is assigned
	private int tax;
	private int grossSalary;
	private int netSalary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public byte getMonth() {
		return month;
	}

	public void setMonth(byte month) {
		this.month = month;
	}

	public byte getYear() {
		return year;
	}

	public void setYear(byte year) {
		this.year = year;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		if (basicSalary > 0) {
			this.basicSalary = basicSalary;
		} else {
			System.out.println("Invalid salary");
		}
	}

	public boolean isLoanTaken() {
		return loanTaken;
	}

	public void setLoanTaken(boolean loanTaken) {
		this.loanTaken = loanTaken;
	}

	public short getEmployee_id() {
		return employee_id;
	}

	public int getHRA() {
		return HRA;
	}

	public int getDA() {
		return DA;
	}

	public int getTA() {
		return TA;
	}

	public int getMA() {
		return MA;
	}

	public int getPF() {
		return PF;
	}

	public int getEMI() {
		return EMI;
	}

	public int getTax() {
		return tax;
	}

	public int getGrossSalary() {
		return grossSalary;
	}

	public int getNetSalary() {
		return netSalary;
	}

	private void setHRA() {
		HRA = (int) (0.10 * basicSalary);
	}

	private void setDA() {
		DA = (int) (0.05 * basicSalary);
	}

	private void setTA() {
		TA = (int) (0.03 * basicSalary);
	}

	private void setMA() {
		MA = (int) (0.07 * basicSalary);
	}

	private void setPF() {
		PF = (int) (0.05 * basicSalary);
	}

	private void setEMI() {
//		if(loanTaken == true) {
//			EMI = (int)(0.10 * basicSalary);
//			return;
//		}
//		EMI = 0;

		if (loanTaken) {
			EMI = (int) (0.10 * basicSalary);
		} else {
			EMI = 0;
		}
		// employee -> 1 month -> no loan -> emi -> 0
		// employee -> loan Taken -> yes -> emi = 1500
		// employee -> 2 years 1 month -> emi = 0

	}

	private void setTax() {
		if ((basicSalary * 12) > 1000000) {
			tax = (int) (0.30 * basicSalary);
		} else if ((basicSalary * 12) > 700000) {
			tax = (int) (0.20 * basicSalary);
		} else if ((basicSalary * 12) > 500000) {
			tax = (int) (0.10 * basicSalary);
		} else {
			tax = 0;
		}
	}

	private void setGrossSalary() {
		grossSalary = basicSalary + HRA + DA + TA + MA - PF;
	}

	private void setNetSalary() {
		netSalary = grossSalary - tax - EMI;
	}

	public void setEmployee_id(short employee_id) {
		this.employee_id = employee_id;
	}
	
	/** Don't let anyone instantiate this class */
//	private EmployeeSalarySlip() {
		/* default constructor - by default present in every class
		 creates empty object */
		// new creates memory for instance variables
//	}
	
	private EmployeeSalarySlip() {
		// TODO Auto-generated constructor stub
	}
	
	// If you create a parameterised constructor then the default condtructor created
	// by Java is killed automatically
	// But if you want to use both default constructor and parameterised then you 
	// need to define both of them
	// Even if constructor never returns anything then also we dont write 
	// void for its return type
	
	public EmployeeSalarySlip(int employee_id, String name, String designation, int month, int year, int basicSalary,
			boolean loanTaken) {
		this.employee_id = (short)employee_id;
		this.name = name;
		this.designation = designation;
		this.month = (byte)month;
		this.year = (byte)year;
		this.basicSalary = basicSalary;
		this.loanTaken = loanTaken;
		setHRA();
		setDA();
		setTA();
		setMA();
		setPF();
		setEMI();
		setTax();
		setGrossSalary();
		setNetSalary();
	}
	

//	public void takeInput(int employee_id, String name, String designation, int month, int year, int basicSalary,
//			boolean loanTaken) {
//
//		this.employee_id = (short)employee_id;
//		this.name = name;
//		this.designation = designation;
//		this.month = (byte)month;
//		this.year = (byte)year;
//		this.basicSalary = basicSalary;
//		this.loanTaken = loanTaken;
//		setHRA();
//		setDA();
//		setTA();
//		setMA();
//		setPF();
//		setEMI();
//		setTax();
//		setGrossSalary();
//		setNetSalary();
//
//	}
	
	public void printSalarySlip() {
		System.out.println(EmployeeSalarySlip.COMPANY_NAME);
		System.out.println();
		System.out.println("Employee name - " + name);
		System.out.println("Employee id - " + employee_id);
		System.out.println("Designation - " + designation);
		System.out.println("Month - " + month);
		System.out.println("Year - " + year);
		System.out.println("Basic salary - " + basicSalary);
		System.out.println("Loan taken - " + loanTaken);
		System.out.println("HRA - " + HRA);
		System.out.println("DA - " + DA);
		System.out.println("TA - " + TA);
		System.out.println("MA - " + MA);
		System.out.println("PF - " + PF);
		System.out.println("EMI - " + EMI);
		System.out.println("Tax - " + tax);
		System.out.println("Gross salary - " + grossSalary);
		System.out.println("Net salary - " + netSalary);
		System.out.println("*************************");
		System.out.println();
	}

}

public class Solution2 {

	public static void main(String[] args) {

		EmployeeSalarySlip employee1 = new EmployeeSalarySlip(101, "Ram", "Developer", 1, 0, 25000, false);
//		employee1.takeInput(101, "Ram", "Developer", 1, 0, 25000, false);
		employee1.printSalarySlip();
		
//		System.out.println("Basic salary of Ram is " + employee1.getBasicSalary());
//		System.out.println("Gross salary of Ram is " + employee1.getGrossSalary());
//		System.out.println("Net salary of Ram is " + employee1.getNetSalary());

		EmployeeSalarySlip employee2 = new EmployeeSalarySlip(102, "Shyam", "Sr. Developer", 1, 2, 50000, true);
//		employee2.takeInput(102, "Shyam", "Sr. Developer", 1, 2, 50000, true);
		employee2.printSalarySlip();
		
//		System.out.println("Basic salary of Shyam is " + employee2.getBasicSalary());
//		System.out.println("Gross salary of Shyam is " + employee2.getGrossSalary());
//		System.out.println("Net salary of Shyam is " + employee2.getNetSalary());
		
//		EmployeeSalarySlip obj = new EmployeeSalarySlip();
//		obj.setHRA();
//		obj.setEmployee_id(-101);
//		obj.getHRA();
		
//		EmployeeSalarySlip employee3 = new EmployeeSalarySlip();
//		employee3.EmployeeSalarySlip(employee_id, name, designation, month, year, basicSalary, loanTaken);

		/*
		 * Assign Salary Slip
		 * 
		 * "XYZ Pvt. Ltd." (static)
		 * 
		 * "Ram Kumar" 
		 * Employee id - 101 // no setter - unique 
		 * Designation - "Developer"
		 * Month - 6 
		 * Year - 1 
		 * Basic Salary (monthly) - 15000 
		 * Loan Taken = true/false 
		 * HRA (House Rent Allowance) - 10% 
		 * DA (Dearness Allowance - inflation) - 5% 
		 * TA (travel allowance) - 3% 
		 * MA (medical allowance) - 7% 
		 * PF (Provident Fund) - 5%
		 * deduct Loan (EMI, 0%) - 10% 
		 * Tax Deduction (tax brackets) 
		 * <500000 -> No tax 5-7 lakhs -> 10% tax, 7-10 lakhs -> 20%, >10 -> 30% 
		 * Gross Salary ->Basic + DA +TA + MA - PF 
		 * Net Salary -> G.S. - Tax - Loan EMI
		 */

	}

}
