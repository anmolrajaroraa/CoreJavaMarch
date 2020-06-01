package oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling4 {
	
	public static int correctPin = 1234;
	
	public static int accountBalance = 10000;
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void verifyPin(int pin) throws InputMismatchException {
		
		if(correctPin != pin) throw new InputMismatchException("Invalid PIN");
		
	}
	
	/**
	 * 
	 * @throws InputMismatchException
	 * @throws ArithmeticException
	 */
	public static void withdraw() throws InputMismatchException, ArithmeticException{
		
			System.out.println("Please enter your PIN");
			
			int pin = scanner.nextInt();
			
			verifyPin(pin);
			
			System.out.println("Enter amount to withdraw");
			
			int amount = scanner.nextInt();
			
			if(amount > accountBalance) throw new ArithmeticException("Amount can't be withdrawn");
			
			accountBalance -= amount;
			
			System.out.println("Remaining balance - " + accountBalance);

	}

	public static void main(String[] args) {
		
//		ExceptionHandling4 obj = new ExceptionHandling4();
//		
//		throw new Exception();
		
		while(true) {
			System.out.println("Welcome to ABC Bank...");
			
			try {
				int pin = scanner.nextInt();
				withdraw();
			}
			
			catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println("Thanku for visiting us..\n");
		}

	}

}
