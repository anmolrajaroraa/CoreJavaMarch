package questions;

public class Solution2 {

	public static void main(String[] args) {
		
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
		
		int HRA(int basicSalary) {
			return 0.10 * basicSalary;
		}

	}

}
