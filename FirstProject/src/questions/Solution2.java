package questions;

class EmployeeSalarySlip{
	// pool object is consuming 26 bytes (single object) // 8 byte in every object
	//static is used so that companyName variable is only created once at the time of class loading and not created in every object
	//because companyName is string, so it's object will be created only once in the pool
	//private is used because I want to block get and set actions for companyName variable
	//final can also be used to block only set action (makes variable constant)
	//private static String companyName = "XYZ Pvt. Ltd.";
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
	private int EMI;
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
		if(basicSalary > 0) {
			this.basicSalary = basicSalary;
		}
		else {
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
	private void setHRA(){
		HRA = (int)(0.10 * basicSalary);
	}
	private void setDA() {
		DA = (int)(0.05 * basicSalary);
	}
	private void setTA() {
		TA = (int)(0.03 * basicSalary);
	}
	private void setMA() {
		MA = (int)(0.07 * basicSalary);
	}
	private void setPF() {
		PF = (int)(0.05 * basicSalary);
	}
	private void setEMI() {
		EMI = (int)(0.10 * basicSalary);
	}
	private void setTax() {
		tax = 0;
//		tax = (int)(0.10 * basicSalary);
	}
	private void setGrossSalary() {
		grossSalary = basicSalary + HRA + DA + TA - PF;
	}
	private void setNetSalary() {
		netSalary = grossSalary - tax - EMI;
	}
	public void setEmployee_id(short employee_id) {
		this.employee_id = employee_id;
	}
	public void takeInput(short employee_id, String name, String designation, 
			byte month, byte year, int basicSalary, boolean loanTaken) {
		
		this.employee_id = employee_id;
		this.name = name;
		this.designation = designation;
		this.month = month;
		this.year = year;
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
		
	}
	
}

public class Solution2 {

	public static void main(String[] args) {
		
//		EmployeeSalarySlip obj = new EmployeeSalarySlip();
//		obj.setHRA();
//		obj.setEmployee_id(-101);
//		obj.getHRA();
		
		/*Assign Salary Slip
		
		"XYZ Pvt. Ltd." (static)
		
		"Ram Kumar"
		Employee id - 101 // no setter - unique
		Designation - "Developer"
		Month - 6 
		Year - 1
		Basic Salary (monthly) - 15000
		Loan Taken = true/false
		HRA (House Rent Allowance) - 10%
		DA (Dearness Allowance - inflation) - 5% 
		TA (travel allowance) - 3%
		MA (medical allowance) - 7%
		PF (Provident Fund) - 5% deduct 
		Loan (EMI, 0%) - 10% deduct
		Tax Deduction (tax brackets) - <500000 -> No tax
		5-7 lakhs -> 10% tax, 7-10 lakhs -> 20%, >10 -> 30%
		Gross Salary -> Basic + DA +TA + MA - PF
		Net Salary -> G.S. - Tax - Loan EMI
		*/

	}

}
